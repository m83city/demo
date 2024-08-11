package com.example.demo.repository.jpa;

import com.example.demo.repository.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentJPARepository extends JpaRepository<StudentEntity, Long> {
}
