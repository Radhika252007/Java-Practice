package com.radhika.Lecture20;

public class StaticAndInstance {
    int instanceVar = 30;
    static int staticVar = 20;

    public static void main(String[] args) {
        StaticAndInstance a = new StaticAndInstance();
        System.out.println(a.instanceVar);
        System.out.println(staticVar);
    }
}
