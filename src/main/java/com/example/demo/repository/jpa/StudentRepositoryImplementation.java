package com.example.demo.repository.jpa;

import com.example.demo.domain.Student;
import com.example.demo.repository.mapper.StudentRepositoryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

import static com.example.demo.repository.mapper.StudentRepositoryMapper.asStudent;

@Repository
@RequiredArgsConstructor
public class StudentRepositoryImplementation {
    private final StudentJPARepository studentJPARepository;

    public Student getById(Long id){
        return asStudent(studentJPARepository.getReferenceById(id));
    }
    public List<Student> getAll (){
        return studentJPARepository
                .findAll()
                .stream()
                .map(StudentRepositoryMapper::asStudent)
                .collect(Collectors.toList());
    }
}
