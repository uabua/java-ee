package demo;

import demo.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import demo.service.StudentService;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentService studentService = applicationContext.getBean("StudentService", StudentService.class);
        System.out.println(studentService.getStudents().get(0));
    }
}
