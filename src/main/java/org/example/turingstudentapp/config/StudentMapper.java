package org.example.turingstudentapp.config;

import org.example.turingstudentapp.domain.dto.StudentDto;
import org.example.turingstudentapp.domain.entity.StudentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface StudentMapper {

    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    StudentDto entityToDto(StudentEntity student);

    List<StudentDto> entityToDto(List<StudentEntity> students);


    StudentEntity dtoToEntity(StudentDto personDTO);

}