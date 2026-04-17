package com.student.studentapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.studentapp.model.Student;
import com.student.studentapp.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public Student saveStudent(Student student) {
        return repo.save(student);
    }

    public Student getStudentById(int id) {
        return repo.findById(id).orElse(null);
    }

    public Student updateStudent(int id, Student student) {
    Student existing = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Student not found"));

    existing.setName(student.getName());
    existing.setEmail(student.getEmail());
    existing.setCourse(student.getCourse());

    return repository.save(existing);
}
public void deleteStudent(int id) {
    repository.deleteById(id);
}
}