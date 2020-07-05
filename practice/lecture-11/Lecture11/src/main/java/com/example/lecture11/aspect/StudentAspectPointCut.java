package com.example.lecture11.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class StudentAspectPointCut {
//    @Pointcut("execution(public String getTask())")
//    public void getTaskPointCut() {
//
//    }
//
//    @Before("getTaskPointCut()")
//    public void a() {
//        System.out.println("PCa");
//    }
//
//    @Before("getTaskPointCut()")
//    public void b() {
//        System.out.println("PCb");
//    }

    @Pointcut("within(*com.example.lecture11.service.impl.*)")
    public void allMethodsPointCut() {

    }

    @Before("allMethodsPointCut()")
    public void c() {
        System.out.println("before executing service method");
    }

}
