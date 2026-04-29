package com.example.examStudentM.controller;

import com.example.examStudentM.model.Student;
import com.example.examStudentM.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    // CREATE
    @PostMapping
    public String create(@RequestBody Student s) {
        service.create(s);
        return "Student Created";
    }

    // READ ALL
    @GetMapping
    public List<Student> getAll() {
        return service.getAll();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public Student getById(@PathVariable int id) {
        return service.getById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public String update(@PathVariable int id, @RequestBody Student s) {
        service.update(id, s);
        return "Student Updated";
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        service.delete(id);
        return "Student Deleted";
    }
}