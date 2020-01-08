package com.practice;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.List;

public class Challenge01 {
    public static void main(String[] args) {
        String s = "abcde";
        long result = substringCalculator(s);
        System.out.println(result);
    }

    private static long substringCalculator(String s) {
        List<String> list = new ArrayList<String>();
        long count = 0;
        for(int i = 0; i<s.length();i++){
            String sub = s.substring(i);
            for (int j=0;j<sub.length();j++){
                String subDistinct = sub.substring(0, sub.length()-j);
                System.out.println(sub+"---"+subDistinct);
                if(!list.contains(subDistinct)){
                    list.add(subDistinct);
                    count++;
                }
            }
        }
        return count;
    }
}
