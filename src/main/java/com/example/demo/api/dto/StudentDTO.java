package com.example.demo.api.dto;

import lombok.*;

@Data
@Builder
public class StudentDTO {
    private Long id;
    private String name;
    private String second_name;
    private Integer age;
    private Integer course;
}
