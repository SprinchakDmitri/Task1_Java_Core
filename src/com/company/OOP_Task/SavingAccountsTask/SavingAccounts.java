package com.company.OOP_Task.SavingAccountsTask;

import java.math.BigDecimal;

public class SavingAccounts {
    private static Double annualInterestRate;
    private Double savingsBalance;

    SavingAccounts(Double savingBalance){
        this.savingsBalance = savingBalance;
    }


   public static void modifyInterestRate(Double newAnnualInterestRate){
        if(newAnnualInterestRate < 0 || newAnnualInterestRate > 100)
        {   throw new IllegalArgumentException(newAnnualInterestRate +
                    "Value must be between 0 and 100");}
        annualInterestRate = newAnnualInterestRate;
    }


    public void calculateMonthlyInterest(){
        savingsBalance += (savingsBalance * (annualInterestRate /100) / 12);
    }


    static Double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public void getSavingsBalance(){
        System.out.println(savingsBalance);
    }


}
