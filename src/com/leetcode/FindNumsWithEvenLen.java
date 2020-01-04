package com.leetcode;

import java.util.Scanner;

public class FindNumsWithEvenLen {
    public static void main(String[] args) {
        int[] arr = {123,2,33,12,1234};
        int count = 0;
        for (int value : arr) {
            if ((String.valueOf(value).length()) % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
