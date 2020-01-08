package com.hackerRank.algorithms;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangrams {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        char[] strArr = str.toUpperCase().toCharArray();
        Set<Character> charSet = new HashSet<Character>();
        for(int i=0;i<strArr.length;i++){
            if(strArr[i] != ' '){
                charSet.add(strArr[i]);
            }
        }
        if(charSet.size() == 26){
            System.out.println("pangram");
        }else{
            System.out.println("not pangram");
        }
    }
}
