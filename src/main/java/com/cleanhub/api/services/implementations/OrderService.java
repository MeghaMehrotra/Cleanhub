package com.cleanhub.api.services.implementations;

import com.cleanhub.api.entity.Order;
import com.cleanhub.api.services.interfaces.IOrderService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class OrderService implements IOrderService {

    @Value("${order.url")
    String orderApiUrl;
    @Override
    public ResponseEntity<Order[]>  fetchOrders() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("user-agent", "Application");
        HttpEntity<String> entity = new HttpEntity<>(headers);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Order[]> res =  restTemplate.exchange("https://marketplace.cleanhub.com/api/public/orders/logos", HttpMethod.GET,entity,Order[].class);
        return res;
    }
}
