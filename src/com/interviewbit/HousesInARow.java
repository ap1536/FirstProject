package com.interviewbit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.*;
import java.util.Scanner;
import java.util.stream.Collectors;

class HousesInARow
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,0,0,0,0,1,0,0};
        int k = 1;
        findFinalCell(arr, k);
    }
    private static void findFinalCell(int[] states, int days) {
        List<Integer> newStates = new ArrayList<Integer>();
        for (int d = 0; d < days; d++) {
            for (int i = 0; i < states.length; i++) {
                newStates.add(i,states[i]);
            }
            if (newStates.get(1) == 1) {
                states[0] = 1;
            } else {
                states[0] = 0;
            }
            for (int j = 1; j <= 6; j++) {
                states[j] = newStates.get(j-1) ^ newStates.get(j + 1);
            }
            if(newStates.get(6)==1){
                states[7]=1;
            }else {
                states[7]=0;
            }
        }
        List<Integer> presentStates = Arrays.stream(states)
                .boxed()
                .collect(Collectors.toList());

        Arrays.stream(states).forEach(s-> System.out.print(s+" "));
    }
}
