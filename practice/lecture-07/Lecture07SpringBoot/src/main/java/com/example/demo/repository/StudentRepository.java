package com.example.demo.repository;

import com.example.demo.model.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> findAll();
}
