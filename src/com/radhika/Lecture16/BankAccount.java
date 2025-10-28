package com.radhika.Lecture16;

public class BankAccount {
    private double balance;
    public BankAccount(double balance){
        this.balance = balance;
    }
    public void deposit(double money){
        this.balance += money;
    }
    public void withdraw(double money){
        this.balance-=money;
    }
    void display(){
        System.out.println("Your Current Balance is: "+this.balance);
    }
}
