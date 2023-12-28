package com.example.quanlydatcho.model;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


public class Order {


    private Long id;


    private Customer customer;

    private Date orderTime;
    private double totalAmount;
    private String status; // New, In Progress, Completed, etc.

    private List<OrderItem> orderItems;
}
