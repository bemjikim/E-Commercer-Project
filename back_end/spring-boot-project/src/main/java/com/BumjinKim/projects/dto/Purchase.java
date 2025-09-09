package com.BumjinKim.projects.dto;

import com.BumjinKim.projects.entity.Address;
import com.BumjinKim.projects.entity.Customer;
import com.BumjinKim.projects.entity.Order;
import com.BumjinKim.projects.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
