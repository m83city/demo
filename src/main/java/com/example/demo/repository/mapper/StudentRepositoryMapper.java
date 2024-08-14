package com.example.demo.repository.mapper;


import com.example.demo.domain.Student;
import com.example.demo.repository.entity.StudentEntity;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentRepositoryMapper {
    public static StudentEntity asStudentEntity(Student student) {
        return StudentEntity.builder()
                .age(student.getAge())
                .course(student.getCourse())
                .id(student.getId())
                .name(student.getName())
                .secondName(student.getSecondName())
                .build();
    }

    public static Student asStudent(StudentEntity student) {
        return Student.builder()
                .age(student.getAge())
                .course(student.getCourse())
                .id(student.getId())
                .name(student.getName())
                .secondName(student.getSecondName())
                .build();
    }
}
