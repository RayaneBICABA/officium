package com.pankassi.domain.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "REFRESH_TOKEN")
public class RefreshToken {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "refreshTokenId")
    private Long refreshTokenId;

    @Column(name = "createdAt",nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "expiresAt",nullable = false)
    private LocalDateTime expiresAt;

    @Column(name = "token",nullable = false)
    private String token;

}
