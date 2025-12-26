package com.pankassi.domain.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "ROLE")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "clientId")
    private Long clientId;

    @Column(name = "roleName",nullable = false)
    private String roleName;

    @Column(name = "roleDescription",nullable = false)
    private String roleDescription;

    @ManyToMany(mappedBy = "roles")
    @JsonBackReference
    private Set<Client> client;

    @ManyToMany
    @JsonBackReference
    @JoinTable(
            name = "RoleResource",
            joinColumns = @JoinColumn(name = "roleId"),
            inverseJoinColumns = @JoinColumn(name = "resourceId")
    )
    private Set<Resource> resources;
}
