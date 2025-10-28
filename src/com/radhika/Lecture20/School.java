package com.radhika.Lecture20;

import javax.swing.plaf.basic.BasicTreeUI;

public class School {
    static String schoolName;
    String studentName;

    public School(String studentName,String schoolName) {
        this.studentName = studentName;
        School.schoolName = schoolName;
    }

    public static void main(String[] args) {
        School s1 = new School("Radhika","Delhi Public School");
        System.out.println(schoolName);
        School s2 = new School("Ayaan","D.V.S Public School");
        System.out.println(schoolName);

    }
}
