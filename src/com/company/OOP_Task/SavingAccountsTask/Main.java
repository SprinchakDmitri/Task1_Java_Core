package com.company.OOP_Task.SavingAccountsTask;


public class Main {



    public static void main(String[] args) {

        SavingAccounts saver1 = new SavingAccounts(2000.00);
        SavingAccounts saver2 = new SavingAccounts(3000.00);

        SavingAccounts.modifyInterestRate(4.0);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.print("First saver balance: ");
        saver1.getSavingsBalance();

        System.out.print("Second saver balance: ");
        saver2.getSavingsBalance();

        SavingAccounts.modifyInterestRate(5.0);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.print("First saver, new values of deposit: ");
        saver1.getSavingsBalance();

        System.out.print("Second saver, new values of deposit: ");
        saver2.getSavingsBalance();


    }
}
