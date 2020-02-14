package com.interviewbit;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class MajorityElement {
    public static void main(String[] args) {
        final List<Integer> A = new ArrayList<Integer>();
        A.add(3);
        A.add(4);
        A.add(3);
        A.add(4);
        A.add(4);
        A.add(4);
        A.add(3);
        A.add(4);
        A.add(2);

        System.out.println(findMajorityElement(A));
    }

    private static int findMajorityElement(final List<Integer> A) {
        int majorElement = -1;
        for(int i=0; i<A.size(); i++){
            int count = 1;
            for(int j=i+1; j<A.size(); j++){
                if(A.get(i).equals(A.get(j))){ ++count; }
            }
            //int[] allIndexes = IntStream.range(0, A.size()).filter(k -> A.get(k).equals(searchNum)).toArray();
            if(count > (A.size()/2)) {
                majorElement = A.get(i);
                return majorElement;
            }
        }
        return -1;
    }
}
