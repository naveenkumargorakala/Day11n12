package com.bridgelabz.oops.day11n12;

import java.util.Scanner;
import java.util.*;

public class AccountManagement {
Account account= new Account(5000);

    Scanner input= new Scanner(System.in);
    public void deposit() {
        System.out.println("Enter deposit amount: ");
        int depositAmount=input.nextInt();
        depositAmount += account.getBalanceAmount() ;
        account.setBalanceAmount(depositAmount);
        System.out.println("currentbalance= " +account.getBalanceAmount());
    }
    public void debit() {
        System.out.println("enter amount to withdraw: ");
        int debitAmount = input.nextInt();
        if (debitAmount <= account.getBalanceAmount()) {
            debitAmount -= account.getBalanceAmount();
            account.setBalanceAmount(debitAmount);
            System.out.println("Amount balance is: " +Math.abs(debitAmount));
        } else {
            System.out.println("Insufficient funds...");
            System.out.println("currentbalance= " + account.getBalanceAmount() );

        }

        }

    public void show() {
        System.out.println("Account balance is: " +account.getBalanceAmount());
    }
}
