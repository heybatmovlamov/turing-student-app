package org.example.turingstudentapp.domain.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class StudentEntity {

    private Long id;
    private String name;
    private String email;
    private LocalDateTime registrationDate;
    private LocalDateTime lastLoginDate;
}
