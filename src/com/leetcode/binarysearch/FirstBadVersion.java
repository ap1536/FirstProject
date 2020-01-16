package com.leetcode.binarysearch;

public class FirstBadVersion {
    public static void main(String[] args) {
        int n = 1; // 1,2,3,4,5
        System.out.println(firstBadVersion(n));
    }

    private static int firstBadVersion(int n) {
        int begin = 1;
        int end = n;
        int mid;
        while(begin<end){
            mid = begin + (end-begin)/2;
            if(isBadVersion(mid)){
                end = mid;
            }else{
                begin = mid+1;
            }
        }
        if(begin == n && (!isBadVersion(begin))) return -1;
        return end;
    }

    private static boolean isBadVersion(int mid) {
        int firstbadversion = 1;
        if(mid >= firstbadversion) return true;
        return false;
    }
}
