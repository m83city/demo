package com.example.demo.service;

import com.example.demo.repository.jpa.StudentJPARepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {
  private final StudentJPARepository studentJPARepository;
}
