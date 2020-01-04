package com.leetcode;

import java.util.Scanner;

public class DefangingIP {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        System.out.println(str.replace(".","[.]"));
    }
}
