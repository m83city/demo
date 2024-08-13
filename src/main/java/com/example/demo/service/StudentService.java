package com.example.demo.service;

import com.example.demo.domain.Student;
import com.example.demo.repository.jpa.StudentJPARepository;
import com.example.demo.repository.jpa.StudentRepositoryImplementation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {
  private final StudentJPARepository studentJPARepository;
  private final StudentRepositoryImplementation studentRepositoryImplementation;

  public Student create (Student student) {
    return studentRepositoryImplementation.create(student);
  }
}
