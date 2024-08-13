package com.example.demo.repository.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student")
@Entity
@Data
@Builder
public class StudentEntity {
    @Id
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "second_name")
    private String second_name;
    @Column(name = "age")
    private Integer age;
    @Column(name = "course")
    private Integer course;
}
