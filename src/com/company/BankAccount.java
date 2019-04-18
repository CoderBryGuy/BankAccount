package com.company;



public class BankAccount {

    BankAccount(){
        this("AAA555", 10_000, "Bryan Bergman", "Bryan.dov.bergman@gmail.com", "(052(875)-1590)");
        System.out.println("Empty constructor called");
    }

    BankAccount(String bankAccount, double  balance, String customerName, String email, String phoneNumber){
        this.bankAccount = bankAccount;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String bankAccount, double balance, String customerName) {
        this(bankAccount, balance, customerName, "Bryan.dov.bergman@gmail.com", "(052(875)-1590)");
 }

    private String bankAccount;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public double getBalance() {
         return balance;
    }

    public void displayBalance(){
        System.out.println("The current balance is: $" + String.format("%.2f", balance));
   }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double deposit) {

        if (deposit < 0) {
            System.out.println("Must deposit a positive number");

        } else {
            balance += deposit;
        }

        System.out.println("$" + String.format("%.2f", deposit) + " added to balance");
        System.out.println("new balance = $" + String.format("%.2f", balance));
    }

    public void withdrawFunds(double withdrawAmount) {

        if (withdrawAmount < 0) {
            System.out.println("Withdraw amount must be a positive number.");

        } else if (withdrawAmount > balance) {
            System.out.println("Insufficient funds. Balance is $" + String.format("%.2f", balance));
        } else {
            balance -= withdrawAmount;
            System.out.println("after withdraw of $" + String.format("%.2f",withdrawAmount) + " new balance is $" + String.format("%.2f", balance));

        }
    }


}
