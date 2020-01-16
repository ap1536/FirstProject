package com.leetcode.binarysearch;


public class GuessNumber {
    public int guessNumber(int n) {
        System.out.println("Input Range: ");
        for (int i=1; i<=n; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        int begin = 1;
        int end = n;
        int mid;
        while(begin <= end){
            mid = begin + (end - begin)/2;
            if(guess(mid) == 0) return mid;
            else if(guess(mid) == -1) end = mid-1;
            else begin = mid+1;
        }
        return -1;
    }

    private int guess(int mid) {
        int targetNumber = GuessNumMain.targetNum;
        if (mid == targetNumber) return 0;
        else if (mid < targetNumber) return 1;
        else return -1;
    }
}
