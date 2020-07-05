package com.example.lecture11.service.impl;

import com.example.lecture11.aspect.Loggable;
import com.example.lecture11.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Loggable
    @Override
    public String getTask() {
        System.out.println("getTask");
        return "getTask";
    }

    @Override
    public void setTask(String task) {
        System.out.println("setTask" + task);
    }

    @Override
    public void exc() {
        System.out.println("exc");
        throw new RuntimeException();
    }
}
