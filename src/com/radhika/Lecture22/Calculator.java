package com.radhika.Lecture22;

public class Calculator {
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return  a+ b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    String add(String a, String b){
        return a+b;
    }

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println("Integer Addition: "+c1.add(2,3));
        System.out.println("Double Addition: "+c1.add(2.3,4.5));
        System.out.println("Three Number Addition: "+c1.add(2,3,4));
        System.out.println("String Concatenation: "+c1.add("Radhika","Madaan"));
    }
}
