package com.hackerRank;

public class HourGlassSum {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24},{25,26,27,28,29,30},{31,32,33,34,35,36}};;
        int CONST = 4;
        int total = -100;
        for (int i=0;i<CONST;i++){
            for(int j=0;j<CONST;j++){
                int sum = arr[i][j]+arr[i][j+1]+arr[i][j+2];
                sum += arr[i+1][j+1];
                sum += arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];

                if(total < sum){
                    total = sum;
                }
            }
        }
        System.out.println(total);
    }
}
