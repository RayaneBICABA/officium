package com.pankassi.domain.model;

import jakarta.persistence.*;
import lombok.*;

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
}
