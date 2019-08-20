package com.dataStructures;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {23,5,2,8,12,7,16,9};
        System.out.println("Given Array ");
        printArray(arr);

        MergeSort ms = new MergeSort();
        ms.sort(arr, 0, arr.length-1);

        System.out.println("Sorted Array :");
        printArray(arr);
    }

    private void sort(int[] arr, int start, int end) {
        if(start < end){
            int mid = (start+end)/2;
            sort(arr, start, mid);
            sort(arr, mid+1, end);

            merge(arr, start, mid, end);
        }
    }

    private void merge(int[] arr, int start, int mid, int end) {
        int n1 = mid-start+1;
        int n2 = end-mid;

        int left[] = new int[n1];
        int right[] = new int[n2];

        for (int i=0; i<n1; i++){
            left[i] = arr[start+i];
        }
        for (int j=0; j<n2; j++){
            right[j] = arr[mid+1+j];
        }

        int i = 0, j = 0;
        int k = start;

        while(i<n1 && j<n2){
            if(left[i] < right[j]){
                arr[k] = left[i];
                i++;
            }else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < n1)
        {
            arr[k] = left[i];
            i++;
            k++;
        }


        while (j < n2)
        {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    private static void printArray(int[] arr) {
        for (int i= 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
