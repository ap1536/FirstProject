package com.interviewbit;

import java.util.List;

public class MaxSumofContiguousArray {
    /**
     * Input 1:
     *     A = [1, 2, 3, 4, -10]
     *
     * Output 1:
     *     10
     *
     * Explanation 1:
     *     The subarray [1, 2, 3, 4] has the maximum possible sum of 10.
     *
     * @param A
     * @return max sum of list A
     */
    public int maxSubArray(final List<Integer> A) {
        int maxHere = A.get(0);
        int maxSoFar = A.get(0);

        for(int i = 1; i<A.size();i++){
            maxHere = Math.max(maxHere + A.get(i), A.get(i));

            if(maxSoFar < maxHere){
                maxSoFar = maxHere;
            }
        }
        return maxSoFar;
    }

}
