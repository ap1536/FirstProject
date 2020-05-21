package com.interviewbit;

import java.util.ArrayList;

public class MaxNonNegativeSubArray {
    public static void main(String[] args) {
        ArrayList<Integer> inputList = new ArrayList<Integer>();
        inputList.add(1);
        inputList.add(2);
        inputList.add(5);
        inputList.add(-7);
        inputList.add(2);
        inputList.add(3);

        int start = -1;
        int end = -1;
        int tmp_start = 0; int tmp_end = 0;
        long sum = Integer.MIN_VALUE;
        long tmp_sum = 0;

        for (int i = 0; i < inputList.size(); i++) {
            if(inputList.get(i)<0){
                tmp_start = i+1;
                tmp_end = i+1;
                tmp_sum = 0;
            }else{
                tmp_sum += inputList.get(i);
                if(tmp_sum > sum){
                    start = tmp_start;
                    end = i;
                    sum = tmp_sum;
                }else if(tmp_sum == sum && (tmp_end - tmp_start > end - start)){
                    start = tmp_start;
                    end = i;
                    sum = tmp_sum;
                }
                tmp_end++;
            }
        }
        ArrayList<Integer> output = new ArrayList<Integer>();
        if(start == -1){
            output.forEach(System.out::println);
        }else{
            for (int i = start; i <= end ; i++) {
                output.add(inputList.get(i));
            }
            output.forEach(System.out::println);
        }
    }
}
