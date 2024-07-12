package org.example.turingstudentapp.service;

import org.example.turingstudentapp.domain.dto.StudentDto;
import org.example.turingstudentapp.domain.entity.StudentEntity;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    StudentEntity save(StudentDto studentDto);

    List<StudentEntity> findAll();

    Optional<StudentEntity> findById(Long id);

    void deleteById(Long id);
}
