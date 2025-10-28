package com.radhika.Lecture20;

public class BankAccount {
    static double interest = 3.5;
    double balance;
    static void changeInterest(double interest){
        BankAccount.interest = interest;
    }
    public BankAccount(double balance) {
        this.balance = balance;
    }
    private double calculateInterest(){
        double interestAmount = balance * (interest/100.00);
        return interestAmount;
    }
    public void display(){
        System.out.println("The Bank Balance is: " + (balance + calculateInterest()));
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(23000);
        b1.display();
        changeInterest(5.0);
        b1.display();
    }
}
