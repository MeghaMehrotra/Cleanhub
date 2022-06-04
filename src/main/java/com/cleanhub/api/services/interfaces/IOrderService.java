package com.cleanhub.api.services.interfaces;

import com.cleanhub.api.entity.Order;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IOrderService {
    ResponseEntity<Order[]> fetchOrders();

}
