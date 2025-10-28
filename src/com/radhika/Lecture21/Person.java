package com.radhika.Lecture21;

public class Person {
    String name;
    String nationality;
    int age;

    public Person(String name) {
        this(name,"Unknown",0);
    }

    public Person(String name, String nationality, int age) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
    }

    void displayDetails(){
        System.out.println("Hi my name is "+ this.name +" and My nationality is "+ this.nationality + ". My age is "+ this.age);
    }

    public Person(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }

    void speak(String message){
        System.out.println(this.name + " says "+ message);
    }
    void speak(String message, String time){
        System.out.println(this.name+" says "+ message +". Time is "+ time);
    }

    public Person(int age) {
        this.age = age;
    }
    void eat(String food){
        System.out.println(this.name + " eats "+ food);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Radhika","Indian",18);
        Person p2 = new Person("Ayaan");
        System.out.println(p1.name);
        p1.speak("Hello There");
        p1.speak("Hello","11:00");
        System.out.println(p2.nationality);


    }
}
