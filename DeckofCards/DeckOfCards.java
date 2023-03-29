package com.bridgelabz.oops.day11n12;
import java.util.*;
import java.util.Random;
public class DeckOfCards {
    public static void main(String[] args) {
        String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] Rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int i = suit.length * Rank.length;
        String[] deckOFCards = new String[i];
        for (int n = 0; n < Rank.length; n++) {
            for (int m = 0; m < suit.length; m++) {

                deckOFCards[suit.length * n + m] = Rank[n] + "  Of  " + suit[m];

            }
        }

        for (int n = 0; n < i; n++) {
            int p = n + (int) (Math.random() * (i - n));
            String cards = deckOFCards[p];
            deckOFCards[p] = deckOFCards[n];
            deckOFCards[n] = cards;
        }
        for (int k = 1; k < 5; k++) {
            System.out.println("\nPlayer " + k + ":");

            for (int n = 0; n < 9; n++) {
                System.out.println(deckOFCards[(k * 9) + n]);
            }
        }
    }
}

