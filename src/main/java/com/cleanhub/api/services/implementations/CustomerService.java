package com.cleanhub.api.services.implementations;

import com.cleanhub.api.entity.*;
import com.cleanhub.api.repository.*;
import com.cleanhub.api.services.interfaces.ICustomerService;
import com.cleanhub.api.services.interfaces.IOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CustomerService implements ICustomerService {

    @Autowired
    private IOrderService orderService;

    @Autowired
    private ICustomerRepository customerRepository;

    @Autowired
    private ICompanyLogoRepository companyLogoRepository;

    @Autowired
    private IProductImageRepository productImageRepository;

    @Autowired
    private ITrustMarkRepository trustMarkRepository;

    @Autowired
    private IHubRepository hubRepository;

    @Value("customer.url")
    String customerUrl;

    private static final Logger log = LoggerFactory.getLogger(CustomerService.class);

    @Override
    @Scheduled(fixedRate = 900000)
    public void saveCustomerHistory() {
        log.debug("Fetching routes from Order Service..");
        List<String> routes = orderService.fetchRoutesFromOrders();

        for (String route : routes) {
            Customer customer = fetchCustomerByRoute(route);
            log.debug("Saving Customer with route"+route);
            saveCustomer(customer);
        }

    }


     public Customer saveCustomer(Customer customer) {
        log.info("Beginning to save customer with customer uuid"+customer.getUuid());
        Customer newCustomer = new Customer();
        if(customer != null) {
            if (customer.getCompanyLogo() != null) {
                CompanyLogo companyLogo = companyLogoRepository.save(customer.getCompanyLogo());
                newCustomer.setCompanyLogo(companyLogo);
            }
            if (customer.getProductImage() != null) {
                ProductImage productImage = productImageRepository.save(customer.getProductImage());
                newCustomer.setProductImage(productImage);
            }
            if (customer.getTrustMark() != null) {
                TrustMark trustMark = trustMarkRepository.save(customer.getTrustMark());
                newCustomer.setTrustMark(trustMark);
            }
            if(customer.getHub() != null){
                Hub hub = hubRepository.save(customer.getHub());
                newCustomer.setHub(hub);
            }
        }
        newCustomer.setLandingPageMode(customer.getLandingPageMode());
        newCustomer.setLandingPageRoute(customer.getLandingPageRoute());
        newCustomer.setUuid(customer.getUuid());
        newCustomer.setQuantity(customer.getQuantity());
        newCustomer.setCommitment(customer.getCommitment());
        newCustomer.setRecoveredQuantity(customer.getRecoveredQuantity());
        newCustomer.setCollectionStartedTimestamp(customer.getCollectionStartedTimestamp());
        newCustomer.setCreatedAt(customer.getCreatedAt());
        newCustomer.setLastModifiedAt(customer.getLastModifiedAt());
        newCustomer.setCommunityActivityEventsSectionEnabled(customer.getCommunityActivityEventsSectionEnabled());
        newCustomer.setCompanyLink(customer.getCompanyLink());
        newCustomer.setIncreaseInQuantity(0.00);
        log.info("Saving customer details");
        Customer savedCustomer = customerRepository.findByUuid(customer.getUuid());
        if(savedCustomer != null){
            newCustomer.setId(savedCustomer.getId());
            newCustomer.setIncreaseInQuantity(customer.getQuantity()- savedCustomer.getQuantity());
        }

        customer = customerRepository.save(newCustomer);
        log.info("Customer save success !!");
        return customer;
    }

    @Override
    public Customer fetchCustomerByUuid(String uuid) {
       return customerRepository.findByUuid(uuid);
    }

    @Override
    public Customer fetchCustomerByRoute(String route) {
        Customer customer = null;
        if(route != null){
            log.info("Begin to fetch customer by route"+route);
            HttpHeaders headers = new HttpHeaders();
            headers.add("user-agent", "Application");
            HttpEntity<String> entity = new HttpEntity<>(headers);
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<Customer> customerResponseEntity =  restTemplate.exchange("https://marketplace.cleanhub.com/api/public/orders?route="+route, HttpMethod.GET,entity,Customer.class);
            customer = customerResponseEntity.getBody();
            log.info("Fetched customer with uuid"+customer.getUuid()+"for route"+route);
        }
        return customer;
    }

    @Override
    public Page<Customer> fetchTopXCustomerByQuantity(Integer limit) {
        Pageable pageable = PageRequest.of(0, limit, Sort.by("increaseInQuantity").descending());
        return customerRepository.findAll(pageable);
    }
}
