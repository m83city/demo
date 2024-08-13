package com.example.demo.api.mapper;

import com.example.demo.api.dto.StudentDTO;
import com.example.demo.domain.Student;

public class APIMapper {
    public static StudentDTO   asStudentDTO (Student student) {
        return StudentDTO.builder()
                .id(student.getId())//ex
                .age(student.getAge())
                .course(student.getCourse())
                .name(student.getName())
                .second_name(student.getSecond_name())
                .build();
    }
    public static Student asStudent(StudentDTO studentDTO){
        return Student.builder()
                .id(studentDTO.getId())
                .age(studentDTO.getAge())
                .course(studentDTO.getCourse())
                .name(studentDTO.getName())
                .second_name(studentDTO.getSecond_name())
                .build();
    }
}

