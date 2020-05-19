package com.hackerRank.Java;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'longestSubarray' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int longestSubarray(List<Integer> arr) {
        // Write your code here
        List<Integer> longestSubArr = new ArrayList<Integer>();
        int longestSubArrLength = 0;
        longestSubArr.add(arr.get(0));
        for (int i = 0; i < arr.size()-1; i++) {
            int diff = arr.get(i)-arr.get(i+1);
            if(((diff > -2) && (diff < 2)) && (longestSubArr.stream().distinct().count() < 2) || longestSubArr.contains(arr.get(i+1))){
                longestSubArr.add(arr.get(i+1));
            } else if (longestSubArrLength < longestSubArr.size()){
                longestSubArrLength = longestSubArr.size();
                longestSubArr.clear();
                longestSubArr.add(arr.get(i+1));
            } else{
                longestSubArr.clear();
                longestSubArr.add(arr.get(i+1));
            }
        }
        System.out.println(Integer.max(longestSubArrLength, longestSubArr.size()));
        return Integer.max(longestSubArrLength, longestSubArr.size());
    }

}

public class LongestSubArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(bufferedReader.readLine().trim());
            arr.add(arrItem);
        }

        int result = Result.longestSubarray(arr);

        bufferedReader.close();
    }
}
