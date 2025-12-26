package com.pankassi.domain.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "CLIENT")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "clientId")
    private Long clientId;

    @Column(name = "firstName",nullable = false,length = 50)
    private String firstName;

    @Column(name = "lastName",nullable = false,length = 50)
    private String lastName;

    @Column(name = "userName",nullable = false,length = 50)
    private String userName;

    @Column(name = "email",nullable = false, length = 50)
    private String email;

    @Column(name = "password",nullable = false,length = 50)
    private String password;

    @Column(name = "isActive",nullable = false,length = 1)
    private boolean isActive;

    @Column(name = "createdAt",nullable = false)
    private LocalDateTime createdAt;

    //Business Method
    public String getFullName(){
        return firstName+" "+lastName;
    }

    @OneToMany(mappedBy = "client")// C'est RefreshToken qui gere la FK via son champ client
    private List<RefreshToken> refreshTokenList;

    @ManyToMany
    @JoinTable(
            name = "ClientRole",
            joinColumns = @JoinColumn(name = "clientId"),
            inverseJoinColumns = @JoinColumn(name = "roleId")
    )
    @JsonBackReference
    private Set<Role> roles;

}
