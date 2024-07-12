package org.example.turingstudentapp.domain.repository;

import org.example.turingstudentapp.service.StudentService;

public class test {
    public static void main(String[] args) {
        InMemoryStudentRepository inMemoryStudentRepository = new InMemoryStudentRepository();
        inMemoryStudentRepository.delete(1L);
    }
}
