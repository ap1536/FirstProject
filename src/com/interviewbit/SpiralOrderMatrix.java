package com.interviewbit;

import java.util.ArrayList;

public class SpiralOrderMatrix {
    public static void main(String[] args) {
        final int[][] A = { {1, 2, 3, 4}, {4, 5, 6, 6}, {7, 8, 9, 9}};
        ArrayList<Integer> list = new ArrayList<Integer>();
        int sr, sc, er, ec, noe = A.length*A[0].length;
        sr = sc = 0;
        er = A.length-1;
        ec = A[0].length-1;

        while(list.size() < noe){
            for(int col = sc; col <= ec && list.size() < noe; ++col){
                list.add(A[sr][col]);
            }
            sr++;
            for (int row = sr; row <= er && list.size() < noe; ++row){
                list.add(A[row][ec]);
            }
            ec--;
            for(int col = ec; col >= sc && list.size() < noe; --col){
                list.add(A[er][col]);
            }
            er--;
            for (int row = er; row >= sr && list.size() < noe; --row){
                list.add(A[row][sc]);
            }
            sc++;
        }
        int[] B = list.stream().mapToInt(Integer::intValue).toArray();
    }
}
