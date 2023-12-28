package com.example.quanlydatcho.model;

import javax.persistence.*;
import javax.persistence.Table;
import java.util.Date;
import java.util.Optional;

@Entity
@Table(name = "Reservation")
public class Reservation {
    @Id
    private Long id;

    @Column(name = "customerId")
    @ManyToOne
    private Long customerId;

    @Column(name = "tableId")
    private Long tableId;
    @Column(name = "reservationTime")
    private Date reservationTime;
    @Column(name = "status")
    private String status; // Confirm, Cancel, Pending, etc.

    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;



}