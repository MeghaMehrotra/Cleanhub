package com.cleanhub.api.services.interfaces;

import com.cleanhub.api.entity.Order;

import java.util.List;

public interface IOrderService {
    List<Order> fetchOrders();
    List<String> fetchRoutesFromOrders();
}
