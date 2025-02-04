package com.ar.constructor;

class Student {

    int sid;
    String sName;
    String sAddress;

    Student () {}

    //Parameterized consturctor
    public Student(int sid, String sName, String sAddress) {
        this.sid = sid;
        this.sName = sName;
        this.sAddress = sAddress;
    }

    //Copy Constructor

    public Student (Student student) {
        this.sid = student.sid;
        this.sName = student.sName;
        this.sAddress = student.sAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sName='" + sName + '\'' +
                ", sAddress='" + sAddress + '\'' +
                '}';
    }
}
public class CopyConstructorEx {
    public static void main(String[] args) {

        Student student = new Student(101, "Nikhil", "Kurnool");
        System.out.println(student);

        System.out.println("Copy Constructor....");

        Student copyStudent = new Student(student);
        System.out.println(copyStudent);
    }
}
