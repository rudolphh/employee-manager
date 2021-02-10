package com.rudyah.employeemanager.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private long id;

    @NonNull
    private String name;
    @NonNull
    private String email;
    @NonNull
    private String jobTitle;
    @NonNull
    private String phone;
    @NonNull
    private String imageUrl;

    @Column(nullable = false, updatable = false)
    private String employeeId;
}
