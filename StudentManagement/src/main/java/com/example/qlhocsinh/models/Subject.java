package com.example.qlhocsinh.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "subject")
public class Subject {
    @Id
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private User teacher;

    @ManyToOne
    @JoinColumn(name = "organization_id")
    private Organization organization;

    private String name;
}
