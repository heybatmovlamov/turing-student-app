package org.example.turingstudentapp.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
@AllArgsConstructor
@Data
public class StudentEntity {

    private Long id;
    private String name;
    private Integer age;
    private String email;
    private double grade;
    private LocalDateTime registrationDate;
    private LocalDateTime lastLoginDate;

    public StudentEntity(String name, Integer age, String email, double grade, LocalDateTime registrationDate, LocalDateTime lastLoginDate) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.grade = grade;
        this.registrationDate = registrationDate;
        this.lastLoginDate = lastLoginDate;
    }
}
