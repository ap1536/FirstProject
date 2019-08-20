package com.company;

public class BubbleSort {
    public void implementation(int[] arr) {
        int temp = 0;
        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int k = 0; k<arr.length; k++){
            System.out.print(arr[k]+" ");
        }
    }
}
