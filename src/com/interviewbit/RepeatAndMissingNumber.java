/**
 * You are given a read only array of n integers from 1 to n.
 *
 * Each integer appears exactly once except A which appears twice and B which is missing.
 *
 * Return A and B.
 *
 * Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Note that in your output A should precede B.
 *
 * Example:
 *
 * Input:[3 1 2 5 3]
 *
 * Output:[3, 4]
 *
 * A = 3, B = 4
 */
package com.interviewbit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepeatAndMissingNumber {
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<Integer>();
        A.add(4);
        A.add(3);
        A.add(6);
        A.add(2);
        A.add(1);
        A.add(1);
        int[] temp = new int[A.size()];
        ArrayList<Integer> output = new ArrayList<Integer>();
        for (int i=0;i<A.size();i++){
            if (temp[A.get(i)-1] == 0) {
                temp[A.get(i)-1] = 1;
            } else {
                output.add(0, A.get(i));
            }
        }
        for (int i=0;i<temp.length;i++){
            if(temp[i] == 0){
                output.add(1, i+1);
            }
        }
        //return output
    }
}
