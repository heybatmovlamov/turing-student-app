package org.example.turingstudentapp.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.example.turingstudentapp.config.StudentMapper;
import org.example.turingstudentapp.domain.dto.StudentDto;
import org.example.turingstudentapp.domain.entity.StudentEntity;
import org.example.turingstudentapp.domain.repository.StudentRepository;
import org.example.turingstudentapp.exception.StudentNotFoundException;
import org.example.turingstudentapp.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Log4j
@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final Logger logger;
    private final StudentRepository studentRepository;

    @Override
    public StudentEntity save(StudentDto studentDto) {
        StudentEntity entity = StudentMapper.INSTANCE.dtoToEntity(studentDto);

        logger.info(entity+"saved");

        return studentRepository.save(entity);
    }

    @Override
    public List<StudentDto> findAll() {
        List<StudentEntity> all = studentRepository.findAll();

        logger.info(all +" : found");

        return StudentMapper.INSTANCE.entityToDto(all);
    }

    @Override
    public Optional<StudentDto> findById(Long id) {
        StudentEntity entity = studentRepository.findById(id).orElseThrow(() -> new StudentNotFoundException("Student not found : " + id));
        StudentDto dto = StudentMapper.INSTANCE.entityToDto(entity);

        logger.info(dto.getName() + ": found");

        return Optional.of(dto);

    }

    @Override
    public void deleteById(Long id) {
         studentRepository.delete(id);
    }
}
