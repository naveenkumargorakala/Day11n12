package com.bridgelabz.oops.day11n12;

import java.util.Scanner;

public class AccountMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Your Account");
        AccountManagement accountManagement = new AccountManagement();
        System.out.println("which operation you want to perform");
        System.out.println("1.Display Balance \n 2.Deposit \n 3.WithDraw \n 4.Exit");
        int choice=input.nextInt();
        switch (choice){
            case 1:
                accountManagement.show();
            break;
            case 2:
                accountManagement.deposit();
            break;
            case 3:
                accountManagement.debit();
            break;
            case 4:
                System.out.println("Exit account");
            break;
        }
    }
}
