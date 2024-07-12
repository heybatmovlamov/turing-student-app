package org.example.turingstudentapp.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
public class StudentDto {
    private String name;
    private Integer age;
    private String email;
    private double grade;
    private LocalDateTime registrationDate;
    private LocalDateTime lastLoginDate;
}
