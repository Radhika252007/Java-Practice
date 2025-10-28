package com.radhika.Lecture16;

public class Person {
    public String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    void display(){
        System.out.println("Name is "+ this.name);
        System.out.println("Address is "+this.address);
    }
    void setAddress(String a){
        this.address = a;
    }
}
