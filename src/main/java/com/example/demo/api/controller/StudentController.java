package com.example.demo.api.controller;

import com.example.demo.api.dto.StudentDTO;
import com.example.demo.domain.Student;
import com.example.demo.service.StudentService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import static com.example.demo.api.mapper.APIMapper.asStudent;
import static com.example.demo.api.mapper.APIMapper.asStudentDTO;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping("/student")
        public ResponseEntity<StudentDTO> create(@RequestBody StudentDTO student){
        Student createStudent = studentService.create(asStudent(student));
        StudentDTO responseMapping = asStudentDTO(createStudent);
                return ResponseEntity.ok(responseMapping);
            }
    }

