package com.example.demo.api.controller;

import com.example.demo.api.dto.StudentDTO;
import com.example.demo.domain.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.demo.api.mapper.APIMapper.asStudentDTO;
import static java.util.Objects.isNull;

@RestController
@RequiredArgsConstructor
public class StudentController {

    @GetMapping("${apiPrefix}/{id}")
        public StudentDTO getById(@PathVariable Long id){
            return asStudentDTO(student);
    }

    @GetMapping("${apiPrefix}/")
        public List<StudentDTO> getAll(){
            return  List<StudentDTO>
    }

    @PostMapping("{apiPrefix}/")
        public ResponseEntity<StudentDTO> create(@RequestBody StudentDTO student){
            if(isNull(student.getId()) ||
                    isNull(student.getAge()) ||
                    isNull(student.getName()) ||
                    isNull(student.getSecondName())||
                    isNull(student.getCourse())
            ){
                return ResponseEntity
                        .status(HttpStatus.BAD_REQUEST)
                        .eTag("BAD REQUESt")
                        .build();
            }else {
                //call method create student
                return ResponseEntity.ok(createdStudent);
            }
    }

    @PutMapping("${apiPrefix}/{id}")
        public StudentDTO updateById(@PathVariable Long id){
            return asStudentDTO(student)
    }

    @DeleteMapping("${apiPrefix}/{id}")
        public Long deleteById(@PathVariable Long id){
            return studentId
    }
}
