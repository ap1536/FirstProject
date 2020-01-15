package com.leetcode.binarysearch;

public class SquareRoot {
    public static void main(String[] args) {
        int target = 3;
        int result = getResult(target);
        System.out.println(result);
    }

    private static int getResult(int x) {
        if (x == 0 || x == 1) return x;

        int low = 1;
        int high = x/2;

        while (low <= high) {
            int mid = low + (high-low)/2;
            int r = x/mid;
            if (r == mid) return mid;
            else if (r < mid) {
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return high;
    }
}
