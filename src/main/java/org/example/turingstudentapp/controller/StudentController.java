package org.example.turingstudentapp.controller;

import lombok.RequiredArgsConstructor;
import org.example.turingstudentapp.domain.dto.StudentDto;
import org.example.turingstudentapp.domain.entity.StudentEntity;
import org.example.turingstudentapp.exception.StudentNotFoundException;
import org.example.turingstudentapp.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    private final StudentService studentService;

    @PostMapping
    public StudentEntity save(@RequestBody StudentDto studentDto){
        return  studentService.save(studentDto);
    }

    @GetMapping
    public List<StudentDto> findAll(){
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<StudentDto> findById(@PathVariable Long id){
        return studentService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String  delete(@PathVariable Long id ){
        studentService.deleteById(id);
        return "deleted !";
    }
}
