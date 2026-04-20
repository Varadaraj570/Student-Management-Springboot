package com.student.studentapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.studentapp.dto.StudentDTO;
import com.student.studentapp.model.Student;
import com.student.studentapp.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    // GET ALL -> DTO Response
    @GetMapping
    public List<StudentDTO> getAllStudents() {

        List<Student> students = service.getAllStudents();
        List<StudentDTO> dtoList = new ArrayList<>();

        for (Student student : students) {

            StudentDTO dto = new StudentDTO();

            dto.setId(student.getId());
            dto.setName(student.getName());
            dto.setEmail(student.getEmail());
            dto.setCourse(student.getCourse());

            dtoList.add(dto);
        }

        return dtoList;
    }

    // POST
    @PostMapping
    public Student saveStudent(@RequestBody StudentDTO dto) {

        Student student = new Student();

        student.setName(dto.getName());
        student.setEmail(dto.getEmail());
        student.setCourse(dto.getCourse());

        return service.saveStudent(student);
    }

    // GET BY ID -> DTO Response
    @GetMapping("/{id}")
    public StudentDTO getStudent(@PathVariable int id) {

        Student student = service.getStudentById(id);

        StudentDTO dto = new StudentDTO();

        dto.setId(student.getId());
        dto.setName(student.getName());
        dto.setEmail(student.getEmail());
        dto.setCourse(student.getCourse());

        return dto;
    }

    // UPDATE
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student student) {
        return service.updateStudent(id, student);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {
        service.deleteStudent(id);
        return "Deleted Successfully";
    }
}