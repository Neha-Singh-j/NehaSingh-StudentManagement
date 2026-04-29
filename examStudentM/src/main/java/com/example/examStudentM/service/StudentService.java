package com.example.examStudentM.service;

import com.example.examStudentM.model.Student;
import com.example.examStudentM.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repo; // repository to handle DB operations

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    // create and save a new student
    public int create(Student s) {
        return repo.save(s);
    }

    // fetch all students
    public List<Student> getAll() {
        return repo.findAll();
    }
//    manually adding
//    public List<Student> getAll() {
//        List<Student> list = new ArrayList<>();
//
//        list.add(new Student(1, "Neha", "neha@gmail.com", "CSE"));
//        list.add(new Student(2, "Rahul", "rahul@gmail.com", "IT"));
//
//        return list;
//    }

    // get a single student by id
    public Student getById(int id) {
        return repo.findById(id);
    }

    // update student details
    public int update(int id, Student s) {
        return repo.update(id, s);
    }

    // delete student by id
    public int delete(int id) {
        return repo.delete(id);
    }
}