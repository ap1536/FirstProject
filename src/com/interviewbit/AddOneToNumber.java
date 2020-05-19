package com.interviewbit;

import java.util.ArrayList;

public class AddOneToNumber {
    /**
     * Given a non-negative number represented as an array of digits,
     * add 1 to the number ( increment the number represented by the digits ).
     * The digits are stored such that the most significant digit is at the head of the list.
     * Example:
     * If the vector has [1, 2, 3]
     * the returned vector should be [1, 2, 4]
     * as 123 + 1 = 124.
     */
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int carry = 1;

        int i = 0;
        while(i < A.size()-1 && A.get(i) == 0){
            A.remove(i);
        }

        i = A.size()-1;
        while(i >= 0){
            int temp = carry + A.get(i);
            carry = temp/10;
            temp = temp%10;

            A.set(i, temp);

            if(carry == 0){
                break;
            }
            i--;
        }
        if(carry > 0 ){
            A.add(0, carry);
        }
        return A;
    }
}
