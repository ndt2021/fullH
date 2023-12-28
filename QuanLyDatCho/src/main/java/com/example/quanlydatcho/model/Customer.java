package com.example.quanlydatcho.model;

import javax.persistence.*;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "Customer")

public class Customer {
    @Id
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name ="phone")
    private String phone;
    @Column(name ="email")
    private String email;

    @OneToMany(mappedBy = "Reservation",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reservation> listReservation;

}