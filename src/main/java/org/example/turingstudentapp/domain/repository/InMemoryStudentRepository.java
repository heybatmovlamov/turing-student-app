package org.example.turingstudentapp.domain.repository;

import jakarta.annotation.PostConstruct;
import org.example.turingstudentapp.domain.entity.StudentEntity;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class InMemoryStudentRepository implements StudentRepository {

    private List<StudentEntity> STUDENTS;
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    @PostConstruct
    public void init() {
        STUDENTS = new ArrayList<>(List.of(
                new StudentEntity(1L, "Selen", 21, "selen@gmail.com", 80.2, LocalDateTime.parse("11/02/2022 00:00", dateFormatter), LocalDateTime.now()),
                new StudentEntity(2L, "Leyla", 29, "leyla@gmail.com", 80.2, LocalDateTime.parse("11/02/2024 00:00", dateFormatter), LocalDateTime.now()),
                new StudentEntity(3L, "Osman", 21, "osman@gmail.com", 80.2, LocalDateTime.parse("11/02/2023 00:00", dateFormatter), LocalDateTime.now()),
                new StudentEntity(4L, "Bahruz", 21, "bahruz@gmail.com", 80.2, LocalDateTime.parse("11/02/2021 00:00", dateFormatter), LocalDateTime.now())
        ));
    }

    @Override
    public StudentEntity save(StudentEntity student) {
        STUDENTS.add(student);
        return student;
    }

    @Override
    public List<StudentEntity> findAll() {
        return STUDENTS;
    }

    @Override
    public Optional<StudentEntity> findById(Long id) {
        return STUDENTS.stream()
                .filter(studentEntity -> studentEntity.getId().equals(id))
                .findFirst();
    }

    @Override
    public void delete(Long id) {
        if (STUDENTS == null) {
            init(); // STUDENTS listesi henüz başlatılmamışsa başlat
        }
        STUDENTS.removeIf(studentEntity -> studentEntity.getId().equals(id));
    }
}
