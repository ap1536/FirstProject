package com.interviewbit;

import java.util.ArrayList;
import java.util.Collections;

public class BinaryRep {
    public static void main(String[] args) {
        int N = 6;
        String str = "";
        while(N>0){
            int rem = N%2;
            str=rem+str;
            N=N/2;
        }
        System.out.println(str);
    }
}
