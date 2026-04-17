package com.student.studentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.studentapp.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}