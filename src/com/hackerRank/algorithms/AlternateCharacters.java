package com.hackerRank.algorithms;

import java.util.Scanner;

public class AlternateCharacters {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int noOfTsts = obj.nextInt();
        String[] strArr = new String[noOfTsts];
        for(int i=0;i<noOfTsts;i++){
            strArr[i] = obj.next();
        }
        for(String str : strArr){
            char[] cArr = str.toCharArray();
            int count = 0;
            char temp = cArr[0];
            for(int j = 0;j<cArr.length;j++){
                if(j+1 != cArr.length){
                    if(temp == cArr[j+1]){count++;}
                    else{temp = cArr[j+1];}
                }
            }
            System.out.println(count);
        }
    }
}
