package com.example.demo.repository.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Table(name = "STUDENT")
@Entity
@Data
@Builder
public class StudentEntity {
    @Id
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "SECOND_NAME")
    private String secondName;
    @Column(name = "AGE")
    private Integer age;
    @Column(name = "COURSE")
    private Integer course;
}
