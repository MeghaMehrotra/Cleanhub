package com.cleanhub.api.controllers;

import com.cleanhub.api.dto.MessageDTO;
import com.cleanhub.api.entity.Order;
import com.cleanhub.api.services.interfaces.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private  IOrderService orderService;

    @GetMapping()
    public ResponseEntity<MessageDTO<List<Order>>> getCustomerOrders() {

               List<Order> orderList =  orderService.fetchOrders();

        return new ResponseEntity<>(
                new MessageDTO<>("Orders fetched successfully!!", orderList, true), HttpStatus.OK);
    }

}
