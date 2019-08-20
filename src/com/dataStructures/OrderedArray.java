package com.dataStructures;

public class OrderedArray {
    public void implementation(int[] arr, int i) {
        int maxIndex = arr.length;
        int minIndex = 0;
        boolean notFoundFlag = true;
        int pivot = (int) Math.floor((maxIndex+minIndex)/2);
        while (arr[pivot] != i){
            if((pivot == minIndex) || (pivot == maxIndex-1)){
                System.out.println("Element not found");
                break;
            }
            if (arr[pivot] < i){
                pivot = (int) Math.floor((pivot+maxIndex)/2);
            }else if (arr[pivot] > i){
                pivot = (int) Math.floor((pivot+minIndex)/2);
            }
        }
        if (arr[pivot] == i){
            System.out.println("pivot "+pivot+" value is "+arr[pivot]);
        }
    }
}
