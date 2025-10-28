package com.radhika.Lecture16;

public class Main {
    public static void main(String[] args) {
        Parent p1 = new Parent(12,34);
        System.out.println(p1.a);
//         System.out.println(p1.b);

        Person p = new Person("Radhika","#1278");
        p.display();
        p.setAddress("#2345");
        p.display();

        BankAccount b1 = new BankAccount(12000);
        b1.display();
        b1.deposit(2300);
        b1.display();
        b1.withdraw(1000);
        b1.display();
        // b1.balance; throws error
    }
}
