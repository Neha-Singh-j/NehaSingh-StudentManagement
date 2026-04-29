package com.example.examStudentM.controller;

import com.example.examStudentM.model.Student;
import com.example.examStudentM.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students") // base URL for all endpoints
public class StudentController {

    private final StudentService service; // service layer object

    public StudentController(StudentService service) {
        this.service = service;
    }

    // add a new student
    @PostMapping
    public String create(@RequestBody Student s) {
        service.create(s);
        return "Student Created";
    }

    // get all students
    @GetMapping
    public List<Student> getAll() {
        return service.getAll();
    }

    // get student by id
    @GetMapping("/{id}")
    public Student getById(@PathVariable int id) {
        return service.getById(id);
    }

    // update student details
    @PutMapping("/{id}")
    public String update(@PathVariable int id, @RequestBody Student s) {
        service.update(id, s);
        return "Student Updated";
    }

    // delete student by id
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        service.delete(id);
        return "Student Deleted";
    }
}