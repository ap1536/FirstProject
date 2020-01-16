package com.leetcode.binarysearch;

import java.util.Scanner;

public class GuessNumMain {
    public static int targetNum;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Target Number:");
        targetNum = input.nextInt();
        System.out.println("Enter Range:");
        int toRange = input.nextInt();
        GuessNumber gn = new GuessNumber();
        System.out.println("Number Guessed "+gn.guessNumber(toRange));
    }
}
