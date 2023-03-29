package com.bridgelabz.oops.day11n12;
import java.util.Scanner;
public class Stock {

    static Scanner sc = new Scanner(System.in);
    private String name;
    private int numShares;
    private int sharePrice;
    private int Totalvalueofeachstock;

    public Stock(String name, int numShares, int sharePrice, int TotalvalueofEachStock) {
        this.name = name;
        this.numShares = numShares;
        this.sharePrice = sharePrice;
        this.Totalvalueofeachstock = TotalvalueofEachStock;
    }

    public Stock() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumShares() {
        return numShares;
    }

    public void setNumShares(int numShares) {
        this.numShares = numShares;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(int sharePrice) {
        this.sharePrice = sharePrice;
    }

    public int getTotalvalueofeachstock() {
        return Totalvalueofeachstock;
    }

    public void setTotalvalueofeachstock(int totalvalueofeachstock) {
        Totalvalueofeachstock = totalvalueofeachstock;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "name='" + name + '\'' +
                ", numShares=" + numShares +
                ", sharePrice=" + sharePrice +
                ", Totalvalueofeachstock=" + Totalvalueofeachstock +
                '}';
    }
}

