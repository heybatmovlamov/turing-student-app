package org.example.turingstudentapp.domain.repository;

import org.example.turingstudentapp.domain.entity.StudentEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository {

    StudentEntity save(StudentEntity student);

    List<StudentEntity> findAll();

    Optional<StudentEntity> findById(Long id);

    void delete(Long id);
}
