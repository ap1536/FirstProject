package com.leetcode.binarysearch;

public class SearchInRotSortArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,8,9,0,1,2,3};
        int target = 7;
        System.out.println(SearchArray(nums, target));
    }

    private static int SearchArray(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid = left + (right-left)/2;
        while(left <= right){
            if(nums[mid] == target) return mid;
            if(nums[left] < nums[right]){   //[0,1,2,3,4,5,6,7,8,9]
                if(nums[mid]>target) right = mid-1;
                else left = mid+1;
            }else{ //[4,5,6,7,8,9,0,1,2,3]
                if(nums[mid]>=nums[left]){
                    if(target>nums[mid] || target<=nums[right]) left = mid+1;
                    else right = mid-1;
                }else{
                    if(target<nums[mid] || target>= nums[left]) right = mid-1;
                    else left = mid+1;
                }
            }
            mid = left + (right-left)/2;
        }
        return  -1;
    }
}
