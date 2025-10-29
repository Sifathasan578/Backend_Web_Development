package com.imrul.hasan.sifat;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("A123");
        System.out.println(bankAccount.getAccountNumber() + " has " + bankAccount.getBalance() + " taka");

        bankAccount.deposit(500);
        System.out.println(bankAccount.getAccountNumber() + " has " + bankAccount.getBalance() + " taka");

        bankAccount.deposit(-100); // will not execute for validation
        System.out.println(bankAccount.getAccountNumber() + " has " + bankAccount.getBalance() + " taka");
    }
}

package com.imrul.hasan.sifat;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            this.balance += amount;
        }
    }


}
