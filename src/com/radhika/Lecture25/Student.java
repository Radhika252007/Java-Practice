package com.radhika.Lecture25;

public class Student {
    private String name;
    private int rollNumber;

    public Student(){
        this("Unknown", 0);
    }
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    public Student(Student s){
        this.name = s.name;
        this.rollNumber = s.rollNumber;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Radhika",12);
        Student s2 = new Student(s1);
        System.out.println(s1.name + " "+s1.rollNumber);
        System.out.println(s2.name+" "+s2.rollNumber);
        s2.name = "Simranpreet";
        System.out.println(s1.name);
    }
}
