
package com.example;

class BankAccount {

    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void displayBankDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {

    double interestRate;

    SavingsAccount(String accountHolder, double balance, double interestRate) {
        super(accountHolder, balance);
        this.interestRate = interestRate;
    }

    void displaySavingsDetails() {
        displayBankDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class PremiumSavingsAccount extends SavingsAccount {

    double bonusInterest;

    PremiumSavingsAccount(String accountHolder, double balance,
                          double interestRate, double bonusInterest) {

        super(accountHolder, balance, interestRate);
        this.bonusInterest = bonusInterest;
    }

    void displayPremiumDetails() {
        displaySavingsDetails();
        System.out.println("Bonus Interest: " + bonusInterest + "%");
    }
}

public class MultilevelInheritance {

    public static void main(String[] args) {

        PremiumSavingsAccount p =
            new PremiumSavingsAccount("Arun", 50000, 5, 2);

        System.out.println("Premium Savings Account Details");

        p.displayPremiumDetails();
    }
}
