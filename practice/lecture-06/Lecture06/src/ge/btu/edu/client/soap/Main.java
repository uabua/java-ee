package ge.btu.edu.client.soap;

import covid.CovidServiceServiceLocator;
import hello.HelloServiceServiceLocator;
import student.Student;
import student.StudentServiceServiceLocator;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ServiceException, RemoteException {
        HelloServiceServiceLocator helloLocator = new HelloServiceServiceLocator();
        System.out.println(helloLocator.getHelloServicePort().sayHallo());
        System.out.println(helloLocator.getHelloServicePort().good(10));

        StudentServiceServiceLocator studentLocator = new StudentServiceServiceLocator();
        Student newStudent = new Student(20, 20, "Mariami");
        studentLocator.getStudentServicePort().addStudent(newStudent);

        CovidServiceServiceLocator covidServiceServiceLocator = new CovidServiceServiceLocator();

        System.out.println(Arrays.toString(covidServiceServiceLocator.getCovidServicePort().getStatistic()));
        System.out.println(covidServiceServiceLocator.getCovidServicePort().getCountryStatistic("US"));
        System.out.println(covidServiceServiceLocator.getCovidServicePort().getCountryStatistic("Spain"));
        System.out.println(covidServiceServiceLocator.getCovidServicePort().getCountryStatistic("Italy"));
        System.out.println(covidServiceServiceLocator.getCovidServicePort().getCountryStatistic("Georgia"));

        System.out.println(covidServiceServiceLocator.getCovidServicePort().getTotalConfirmed());
        System.out.println(covidServiceServiceLocator.getCovidServicePort().getTotalDeath());
        System.out.println(covidServiceServiceLocator.getCovidServicePort().getTotalRecovery());
    }
}
