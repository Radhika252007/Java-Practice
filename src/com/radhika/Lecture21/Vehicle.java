package com.radhika.Lecture21;

public class Vehicle {
    String brand;
    double price;

    public Vehicle(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    void Engine(){
        System.out.println("My Engine is abc");
    }
    void start(){
        System.out.println("Vehicle Started");
    }
    void stop(){
        System.out.println("Vehicle stopped");
    }

    public static void main(String[] args) {
        Car c1 = new Car("BMW",20000000);
        Vehicle v1 = new Vehicle("Honda",230000);
        v1.start();
        v1.stop();
        c1.start();
        c1.stop();
    }
}
class Car extends Vehicle{
    public Car(String brand, double price) {
        super(brand, price);
    }
    @Override
    void start(){
        System.out.println("Car Started");
    }
    @Override
    void stop(){
        System.out.println("Car Stopped");
    }

}
