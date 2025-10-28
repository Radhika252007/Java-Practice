package com.radhika.Lecture20;

public class StaticMethods {
    int instanceVar = 30;
    static  int staticVar = 20;
    static void method(){
        // System.out.println(instanceVar);
        System.out.println(staticVar);
    }

    public static void main(String[] args) {
        method();
    }
}
