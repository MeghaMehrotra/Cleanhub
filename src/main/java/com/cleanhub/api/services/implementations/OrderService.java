package com.cleanhub.api.services.implementations;

import com.cleanhub.api.dto.OrderDTO;
import com.cleanhub.api.entity.Order;
import com.cleanhub.api.services.interfaces.IOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class OrderService implements IOrderService {

    @Value("${order.url")
     String orderApiUrl;

    private static final Logger log = LoggerFactory.getLogger(OrderService.class);

    @Override
    public List<Order> fetchOrders() {
        List<Order> orderList = null;
        HttpHeaders headers = new HttpHeaders();
        headers.add("user-agent", "Application");
        HttpEntity<String> entity = new HttpEntity<>(headers);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Order[]> orderDTO =  restTemplate.exchange("https://marketplace.cleanhub.com/api/public/orders/logos", HttpMethod.GET,entity,Order[].class);
        if(orderDTO != null && orderDTO.getBody() != null) {
            Order[] incomingOrders = orderDTO.getBody();
            orderList = Arrays.asList(incomingOrders);
        }
        return orderList;
    }

    @Override
    public List<String> fetchRoutesFromOrders() {
        List<String> routes = null;
        List<Order> ordersList = fetchOrders();
        if(ordersList != null){
            routes = ordersList.stream()
                    .map(order -> order.getLandingPageRoute())
                    .collect(Collectors.toList());
        }
        return routes;
    }
}
