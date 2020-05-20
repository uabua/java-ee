package com.company;

public class Main {

    public static void main(String[] args) {
        UniversityDemo universityDemo = new UniversityDemo(new MasterStudent());
        universityDemo.print();

        universityDemo.setStudentInterface(new BachelorStudent());
        universityDemo.print();

        universityDemo.setStudentInterface(new PhdStudent());
        universityDemo.print();
    }
}
