package com.cleanhub.api.dto;

import com.cleanhub.api.entity.Order;

import java.io.Serializable;
import java.util.List;

public class OrderDTO implements Serializable {

    List<Order> orders;

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
