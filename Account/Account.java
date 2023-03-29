package com.bridgelabz.oops.day11n12;

import java.util.Scanner;

public class Account {
    Scanner input = new Scanner(System.in);

    private int balanceAmount;
    private int depositAmount;
    private int debitAmount;
    public Account(int balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public int getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(int balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    }

