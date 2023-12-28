package com.example.quanlydatcho.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Dish")
public class Dish {
    @Id
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name= "price")
    private double price;
}