package com.example.lecture11.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAnnotationAspect {

    @Before("@annotation(com.example.lecture11.aspect.Loggable)")
    public void myAdvice() {
        System.out.println("Executing myAdvice!!");
    }
}

