package com.radhika.Lecture18;

import java.util.HashMap;

public class ObjectClass {
    public static void main(String[] args) {
        Vehicle V = new Vehicle("BMW");
//        System.out.println(V);
//        System.out.println(V.toString());
        System.out.println(V.hashCode());
    }
}
class Vehicle{
    String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
