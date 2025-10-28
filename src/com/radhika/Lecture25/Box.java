package com.radhika.Lecture25;

public class Box {
    Double length;
    Double breadth;
    Double height;

    public Box(Double length, Double breadth, Double height) {

        this.length = (length!=null) ? length : 0.0;
        this.breadth = (breadth!=null) ?  breadth : 0.0;
        this.height = (height!=null) ? height : 0.0;
    }

    public static void main(String[] args) {
        //autoboxing
        double length = 2.2;
        double breadth = 1.2;
        double height = 3.4;
        Box b1 = new Box(length,breadth,height);

        //unboxing
        System.out.println(b1.length.doubleValue());
        System.out.println(b1.breadth.doubleValue());
        System.out.println(b1.height.doubleValue());
    }
}
