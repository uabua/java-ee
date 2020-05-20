package com.company;

public class UniversityDemo {
    private StudentInterface studentInterface;

    public UniversityDemo(StudentInterface studentInterface) {
        this.studentInterface = studentInterface;
    }

    public void print() {
        studentInterface.getStudents();
    }

    public void setStudentInterface(StudentInterface studentInterface) {
        this.studentInterface = studentInterface;
    }
}
