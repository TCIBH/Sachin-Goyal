package OOPS;

import java.util.Scanner;

class BankAccount {
    // BankAccount attributes
    private String accountNumber;
    private String accountName;
    private double balance;
    public BankAccount(String accNumber, String accName) {
        accountNumber = accNumber;
        accountName = accName;
        balance = 0;
    }
        public String getAccountName() {
            return accountName;
        }

    public double getBalance() {
        return balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            return true;
        } else {
            return false;
        }
    }
    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false;
        } else {
            balance = balance - amount;
            return true;
        }
    }
}
 class SavingsAccount extends BankAccount {
     private double interestRate;
     public SavingsAccount(String accNumber, String accName, double rate) {
         super(accNumber, accName);
         interestRate = rate;
     }
     public void addInterest() {
         double interest = getBalance() * interestRate / 100;
         deposit(interest);
     }
 }
    public class Banking {
        public static void main(String[] args) {
            BankAccount obj= new BankAccount("20120", "Sachin Goyal");
            obj.deposit(500);
            obj.deposit(1500);
            System.out.println("Balance is: " + obj.getBalance()); // 2000
            obj.withdraw(400);
            System.out.println("Balance is: " + obj.getBalance()); // 1600
            SavingsAccount saving = new SavingsAccount("20120",
                    "Sachin Goyal", 10);
            saving.deposit(500);
            System.out.println("Balance Before Interest: " + saving.getBalance());

            saving.addInterest();
            System.out.println("Balance After Interest: " + saving.getBalance());
        }
}
