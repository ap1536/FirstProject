package com.interviewbit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Factorization {
    public static void main(String[] args) {
        int N = 36;
        ArrayList<Integer> output = new ArrayList<Integer>();
        for (int i=1;i<=Math.sqrt(N);i++){
            if(N%i == 0) {
                output.add(i);
                if(i != Math.sqrt(N)){
                    output.add(N/i);
                }
            }
        }
        Collections.sort(output);
        output.forEach(s -> System.out.print(s+" "));
    }
}
