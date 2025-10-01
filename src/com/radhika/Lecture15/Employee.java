package com.radhika.Lecture15;

public class Employee {
    String name;
    int id;
    String Department;



    Employee(String name, int id, String Department){
        this.name = name;
        this.id = id;
        this.Department = Department;
    }
    @Override
   public String toString(){
        return
                "Name: " + name+"\n"
                +"Id: "+ id +"\n"
                +"Department: "+Department
        ;
   }

    public static void main(String[] args) {
        Employee e1 = new Employee("Radhika",1,"CSE");
        System.out.println(e1.toString());
    }
}
