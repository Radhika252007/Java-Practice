package com.radhika.Lecture16;

class Student {
    private String name;
    private char grade;

    public Student(String name, char grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public char getGrade() {
        return grade;
    }
}
public class School{
    public static void main(String[] args) {
        School s = new School();
        s.displayDetails();
    }
    Student s1 = new Student("Radhika",'A');
    void displayDetails(){
        System.out.println("The name of Student is "+ s1.getName());
        System.out.println("The Grade of Student is "+ s1.getGrade());
    }
}
