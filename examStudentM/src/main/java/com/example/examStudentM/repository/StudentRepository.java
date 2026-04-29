package com.example.examStudentM.repository;

import com.example.examStudentM.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {

    private final JdbcTemplate jdbcTemplate;

    public StudentRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // CREATE
    public int save(Student s) {
        String sql = "INSERT INTO student(name, email, course) VALUES (?, ?, ?)";
        return jdbcTemplate.update(sql, s.getName(), s.getEmail(), s.getCourse());
    }

    // READ ALL
    public List<Student> findAll() {
        String sql = "SELECT * FROM student";
        return jdbcTemplate.query(sql, (rs, rowNum) ->
                new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("course")
                ));
    }

    // READ BY ID
    public Student findById(int id) {
        String sql = "SELECT * FROM student WHERE id=?";
        return jdbcTemplate.queryForObject(sql, (rs, rowNum) ->
                new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("course")
                ), id);
    }

    // UPDATE
    public int update(int id, Student s) {
        String sql = "UPDATE student SET name=?, email=?, course=? WHERE id=?";
        return jdbcTemplate.update(sql, s.getName(), s.getEmail(), s.getCourse(), id);
    }

    // DELETE
    public int delete(int id) {
        String sql = "DELETE FROM student WHERE id=?";
        return jdbcTemplate.update(sql, id);
    }
}