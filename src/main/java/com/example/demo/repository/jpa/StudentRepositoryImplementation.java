package com.example.demo.repository.jpa;

import com.example.demo.domain.Student;
import com.example.demo.repository.entity.StudentEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;


import static com.example.demo.repository.mapper.StudentRepositoryMapper.asStudent;
import static com.example.demo.repository.mapper.StudentRepositoryMapper.asStudentEntity;

@Repository
@RequiredArgsConstructor
public class StudentRepositoryImplementation {
    private final StudentJPARepository studentJPARepository;

    public Student create (Student student){
        StudentEntity createNewRecord = studentJPARepository.save(asStudentEntity(student));
       return  asStudent(createNewRecord);
    }
}
