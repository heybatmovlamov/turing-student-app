package org.example.turingstudentapp.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.turingstudentapp.config.StudentMapper;
import org.example.turingstudentapp.domain.dto.StudentDto;
import org.example.turingstudentapp.domain.entity.StudentEntity;
import org.example.turingstudentapp.domain.repository.StudentRepository;
import org.example.turingstudentapp.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    @Override
    public StudentEntity save(StudentDto studentDto) {
        StudentEntity entity = StudentMapper.INSTANCE.dtoToEntity(studentDto);
        return studentRepository.save(entity);
    }

    @Override
    public List<StudentEntity> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<StudentEntity> findById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
         studentRepository.delete(id);
    }
}
