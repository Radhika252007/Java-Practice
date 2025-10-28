package com.radhika.Lecture17;

public class Parent {
    public static void main(String[] args) {
        Car c1 = new Car("BMW","black","H4",20000000,2);
        Car c2 = new Car("Porsche","black","H7",70000000,4);
        Car c3 = new Car(c1);
        System.out.println(c2.getBrand());
    }
}
class Car{
    private String brand;
    String color;
    String engine;
    int price;
    int seats;

    public Car(String brand, String color, String engine, int price, int seats) {
        this.brand = brand;
        this.color = color;
        this.engine = engine;
        this.price = price;
        this.seats = seats;
    }
    public Car(Car c){
        this.brand = c.brand;
        this.color = c.color;
        this.engine = c.engine;
        this.price = c.price;
        this.seats = c.seats;
    }

    public String getBrand() {
        return brand;
    }
}
