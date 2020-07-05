//package com.example.lecture11.aspect;
//
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.springframework.stereotype.Component;
//
//@Aspect
//@Component
//public class StudentAroundAspect {
//    @Around("execution(* com.example.lecture11.service.impl.StudentServiceImpl.getTask())")
//    public Object studentAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
//        System.out.println("Before invoking getTask() method");
//        Object value = null;
//        try {
//            value = proceedingJoinPoint.proceed();
//        } catch (Throwable e) {
//            e.printStackTrace();
//        }
//        System.out.println("After invoking getTask() method. Return value="+value);
//        return value;
//    }
//}
