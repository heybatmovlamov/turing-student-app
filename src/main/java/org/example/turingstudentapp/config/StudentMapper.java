package org.example.turingstudentapp.config;

import org.example.turingstudentapp.domain.dto.StudentDto;
import org.example.turingstudentapp.domain.entity.StudentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapper {

    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    StudentDto entityToDto(StudentEntity person);

    StudentEntity dtoToEntity(StudentDto personDTO);

}