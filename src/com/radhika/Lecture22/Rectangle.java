package com.radhika.Lecture22;

public class Rectangle {
    Integer length;
    Integer width;

    public Rectangle(Integer length, Integer width) {
        this.length = length;
        this.width = width;
    }


    Integer calculateArea(){
        if (this.length == null || this.width == null) {
            System.out.println("Length or width cannot be null");
            return 0;
        }

        if(this.length<0 ||this.width<0 ){
            System.out.println("Negative numbers not allowed");
            return 0;
        }
        return this.length*this.width;
    }
    Integer calculatePerimeter(){
        if (this.length == null || this.width == null) {
            System.out.println("Length or width cannot be null");
            return 0;
        }

        if(this.length<0 ||this.width<0 ){
            System.out.println("Negative numbers not allowed");
            return 0;
        }
        return 2*(this.width+this.length);
    }
    boolean isSquare(){
        if (this.length == null || this.width == null) {
            System.out.println("Length or width cannot be null");
            return false;
        }
        return this.length.equals(this.width);
    }


    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(23,56);
        Rectangle r2 = new Rectangle(45,45);
        System.out.println("Rectangle 1 Area: "+r1.calculateArea()+" Perimeter: "+r1.calculatePerimeter()+" Is Square: "+r1.isSquare());
        System.out.println("Rectangle 2 Area: "+r2.calculateArea()+" Perimeter: "+r2.calculatePerimeter()+" Is Square: "+r2.isSquare());
    }

}
