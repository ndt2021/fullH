package com.example.qlhocsinh.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "user_subjects")
public class UserSubjects {
    @Id
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;
    private int score;

//    public UserSubjects(UUID id, User user, Subject subject, int score) {
//        this.id = id;
//        this.user = user;
//        this.subject = subject;
//        this.score = score;
//    }
}
