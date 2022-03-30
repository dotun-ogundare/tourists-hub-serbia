package com.scm.ftn.tourist.dto;

import com.scm.ftn.tourist.entity.Address;
import com.scm.ftn.tourist.entity.Customer;
import com.scm.ftn.tourist.entity.Order;
import com.scm.ftn.tourist.entity.OrderItem;
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
