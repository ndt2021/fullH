package com.example.qlhocsinh.models;

import com.example.qlhocsinh.common.constants.OrganizationType;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "organizations")
public class Organization {
    @Id
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Organization parentOrganization;

    @Enumerated(EnumType.STRING)
    @Column(name = "org_type")
    private OrganizationType orgganizationType;

    @OneToOne
    @JoinColumn(name = "head_of_org")
    private User headOfOrg;

    private String name;
}
