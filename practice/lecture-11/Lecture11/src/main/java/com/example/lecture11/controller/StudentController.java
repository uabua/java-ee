package com.example.lecture11.controller;

import com.example.lecture11.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/test")
    public void test() {
        studentService.getTask();
//        studentService.setTask("test");
//        studentService.exc();
    }
}
