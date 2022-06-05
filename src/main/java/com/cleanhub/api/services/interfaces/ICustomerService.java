package com.cleanhub.api.services.interfaces;

import com.cleanhub.api.entity.Customer;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ICustomerService {


   void saveCustomerHistory();

   Customer fetchCustomerByRoute(String route);

   Page<Customer> fetchTopXCustomerByQuantity(Integer limit);

   Customer saveCustomer(Customer customer);

   Customer fetchCustomerByUuid(String uuid);
}
