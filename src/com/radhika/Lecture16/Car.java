package com.radhika.Lecture16;

public class Car {
    public String make;
    public int year;
    Car(String make, int year){
        this.make = make;
        this.year = year;
    }
    void display(){
        System.out.println("The car is Manufactured by " + this.make +" in the year "+ this.year);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Maruti",2004);
        car1.display();
    }
}
