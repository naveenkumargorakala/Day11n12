package com.bridgelabz.oops.day11n12;
import java.util.ArrayList;
import java.util.Scanner;

public class StockManagement {

        Stock stock = new Stock();
        Scanner sc = new Scanner(System.in);
        ArrayList<Stock> stocklist =new ArrayList<>();


        void createStock() {
            System.out.println("how many stocks do you want to add ");
            int no = sc.nextInt();
            for (int i = 0; i < no; i++) {
                System.out.println("Enter name of the "+i+1 +"Stock ");
                String name = sc.next();
                stock.setName(name);
                System.out.println("Enter value of the stock each stock");
                int val = sc.nextInt();
                stock.setSharePrice(val);
                System.out.println("Enter number of share are avaliable for that stock");
                int numofshare = sc.nextInt();
                stock.setNumShares(numofshare);
                System.out.println("Stock added");
                int value = calculateValofEachStock(val , numofshare);
                stock.setTotalvalueofeachstock(value);
                Stock stock1 = new Stock(name, val, numofshare,value);
                stocklist.add(stock1);
            }
        }
        int calculateValofEachStock(int val,int numofshare){
            return val*numofshare;
        }

        void totalvalueofallstocks(){
            double totalvalurofallstack=0;
            for(Stock stock : stocklist)
            {
                totalvalurofallstack = totalvalurofallstack+stock.getTotalvalueofeachstock();
            }
            System.out.println("Total value of all stack is "+totalvalurofallstack);
        }
        void totalvalueofstock(){

            double total = 0;
            for(Stock stock : stocklist)
            {
                total=stock.getNumShares()* stock.getSharePrice();
            }
            System.out.println("total value of the all stock is "+total);

        }
        void display(){
            for(int i =0;i<stocklist.size();i++)
            {
                System.out.println(stocklist.get(i));
            }
        }

        @Override
        public String toString() {
            return "StockManagement{" +
                    "stock=" + stock +
                    ", sc=" + sc +
                    ", stocklist=" + stocklist +
                    '}';
        }
    }

}
