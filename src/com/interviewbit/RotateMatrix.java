/**
 * You are given an n x n 2D matrix representing an image.
 *
 * Rotate the image by 90 degrees (clockwise).
 *
 * You need to do this in place.
 *
 * Note that if you end up using an additional array, you will only receive partial score.
 *
 * Example:
 *
 * If the array is
 *
 * [
 *     [1, 2],
 *     [3, 4]
 * ]
 * Then the rotated array becomes:
 *
 * [
 *     [3, 1],
 *     [4, 2]
 * ]
 */
package com.interviewbit;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> input = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        input.add(a1);

        ArrayList<Integer> a2 = new ArrayList<Integer>();
        a2.add(5);
        a2.add(6);
        a2.add(7);
        a2.add(8);
        input.add(a2);

        ArrayList<Integer> a3 = new ArrayList<Integer>();
        a3.add(9);
        a3.add(10);
        a3.add(11);
        a3.add(12);
        input.add(a3);

        ArrayList<Integer> a4 = new ArrayList<Integer>();
        a4.add(13);
        a4.add(14);
        a4.add(15);
        a4.add(16);
        input.add(a4);

        for (int i = 0; i < input.size(); i++) {
            for (int j = 0; j < input.get(i).size(); j++) {
                System.out.print(input.get(i).get(j)+" ");
            }
            System.out.println();
        }

        System.out.println("===============================================");

        int n = input.size()-1;
        for (int i = 0; i < input.size()/2; i++) {
            for (int j=i; j<n-i; j++){
                int temp1 = input.get(n-j).get(i);
                int temp2 = input.get(n-i).get(n-j);
                int temp3 = input.get(j).get(n-i);
                int temp4 = input.get(i).get(j);

                input.get(i).set(j, temp1);
                input.get(n-j).set(i, temp2);
                input.get(n-i).set(n-j, temp3);
                input.get(j).set(n-i, temp4);
            }
        }
        for (int i = 0; i < input.size(); i++) {
            for (int j = 0; j < input.get(i).size(); j++) {
                System.out.print(input.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
