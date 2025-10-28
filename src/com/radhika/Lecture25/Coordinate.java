package com.radhika.Lecture25;

final public class Coordinate {
    private final int x;
    private final int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
    int getX(){
        return this.x;
    }
    int getY(){
        return  this.y;
    }
    public Coordinate(Coordinate c){
        this.x = c.x;
        this.y = c.y;
    }

    public static void main(String[] args) {
        Coordinate c1 = new Coordinate(2,3);
        System.out.println(c1.x + " "+ c1.y);
        Coordinate c2 = new Coordinate(c1);
        System.out.println(c2.x + " "+ c2.y);
    }
}

