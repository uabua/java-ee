package demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"demo"})
public class AppConfig {

//    @Bean("StudentService")
//    public StudentService getStudentService() {
//        return new StudentServiceimpl(new StudentRepositoryImpl());
//    }
//
//    @Bean("StudentRepository")
//    public StudentRepository getStudentRepository() {
//        return new StudentRepositoryImpl();
//    }
}
