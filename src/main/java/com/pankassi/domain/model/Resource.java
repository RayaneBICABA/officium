package com.pankassi.domain.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "RESOURCE")
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="resourceId")
    private Long resourceId;

    @Column(name = "resourceName",nullable = false,length = 100)
    private String resourceName;

    @Column(name = "description",nullable = false)
    private String description;

}