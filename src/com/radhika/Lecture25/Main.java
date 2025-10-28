package com.radhika.Lecture25;

class Singleton {
        private static Singleton s;
        private Singleton(){
            System.out.println("Singleton Instance Created");
        }
        public static Singleton getInstance(){
            if(s==null){
                s=new Singleton();
            }
            return s;
        }
}
public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        if(s1==s2){
            System.out.println(true);
        }
    }
}
