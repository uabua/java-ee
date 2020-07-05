//package com.example.lecture11.aspect;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.AfterReturning;
//import org.aspectj.lang.annotation.AfterThrowing;
//import org.aspectj.lang.annotation.Aspect;
//import org.springframework.stereotype.Component;
//
//@Aspect
//@Component
//public class StudentAfterAspect {
//    @AfterThrowing("within(com.example.lecture11.service.impl.StudentServiceImpl)")
//    public void logExceptions(JoinPoint joinPoint){
//        System.out.println("Exception thrown in Employee Method="+joinPoint.toString());
//    }
//
//    @AfterReturning(pointcut="execution(* getTask())", returning="returnString")
//    public void getTaskReturningAdvice(String returnString){
//        System.out.println("getNameReturningAdvice executed. Returned String="+returnString);
//    }
//}
