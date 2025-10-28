package com.radhika.Lecture22;

public class BankAccount {
    private long accountNumber;
    private String accountHolder;
    private double balance;
    static int totalAccounts = 0;

    public BankAccount(long accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        totalAccounts++;
    }
    public BankAccount(BankAccount b){
        this.accountNumber = b.accountNumber;
        this.accountHolder = b.accountHolder;
        this.balance = b.balance;
        totalAccounts++;
    }
    void displayDetails(){
        System.out.print("Account Number: "+this.accountNumber);
        System.out.print(" Account Holder: "+this.accountHolder);
        System.out.println(" Balance: $"+this.balance);
    }
    void deposit(double amount){
        this.balance += amount;
        System.out.println("After deposit in "+this.accountHolder+"'s account: $"+this.balance);
    }
    void withdraw(double amount){
        if(balance<amount){
            System.out.println("Insufficient bank balance");
        }
        else {
            this.balance -= amount;
            System.out.println("After withdraw from "+this.accountHolder+"'s account: $"+this.balance);
        }
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(1001,"John",1500);
        BankAccount b2 = new BankAccount(1002,"Alice",2500);
        System.out.println("Total Accounts: "+totalAccounts);
        b1.displayDetails();
        b2.displayDetails();
        b1.deposit(200);
        b2.withdraw(500);
    }
}
