package com.example.lecture11.aspect;

import com.example.lecture11.service.StudentService;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class StudentAspect {

//    @Before("execution(public String getTask())")
//    public void getTaskAdvice() {
//        System.out.println("Executing advice on getTask()");
//    }
//
//    @Before("execution(* com.example.lecture11.service.impl.*.get*())")
//    public void getAllAdvice() {
//        System.out.println("Service method getter called");
//    }
}
