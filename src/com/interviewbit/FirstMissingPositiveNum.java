/**
 * Given an unsorted integer array, find the first missing positive integer.
 *
 * Example:
 *
 * Given [1,2,0] return 3,
 *
 * [3,4,-1,1] return 2,
 *
 * [-8, -7, -6] returns 1
 *
 * Your algorithm should run in O(n) time and use constant space.
 */
package com.interviewbit;

import java.util.ArrayList;

import static java.util.Collections.swap;

public class FirstMissingPositiveNum {
    public static void main(String[] args) {
        ArrayList<Integer> inputList = new ArrayList<>();
        inputList.add(2);
        inputList.add(3);
        inputList.add(5);
        inputList.add(-1);
        inputList.add(-10);

        int output = Integer.MIN_VALUE;
        int n = inputList.size();
        int i = 0;

        while (i<n){
            if(inputList.get(i) == i+1 || inputList.get(i) <= 0 || inputList.get(i) > n){
                i++;
            }else if (!inputList.get(inputList.get(i) - 1).equals(inputList.get(i))){
                swap(inputList, i, inputList.get(i)-1);
            } else {
                i++;
            }
        }
        i=0;
        while (i<n && inputList.get(i) == i+1){
            i++;
        }
        System.out.println(i+1);
    }
}
