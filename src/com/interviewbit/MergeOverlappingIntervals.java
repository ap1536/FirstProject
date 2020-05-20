package com.interviewbit;

import java.util.ArrayList;

public class MergeOverlappingIntervals {
    public static void main(String[] args) {
        ArrayList<Interval> inputList = new ArrayList<Interval>();
        inputList.add(new Interval(1,3));
        inputList.add(new Interval(2,6));
        inputList.add(new Interval(8,10));
        inputList.add(new Interval(15,18));

        //mergeOverlappingIntervals
        inputList.sort((i1, i2) -> i1.start - i2.start);

        for (int i = 0; i < inputList.size() - 1; i++) {
            Interval first = inputList.get(i);
            Interval second = inputList.get(i+1);

            if(first.start <= second.start && first.end >= second.end){
                inputList.remove(i+1);
                i--;
            }
            if(second.start < first.end && first.end < second.end){
                Interval temp = new Interval(first.start, second.end);
                inputList.remove(i+1);
                inputList.set(i,temp);
                i--;
            }
        }
        for (Interval i:
             inputList) {
            System.out.println(i.start+" "+i.end);

        }
    }
}

class Interval{
    int start;
    int end;
    Interval(){
        this.start = 0;
        this.end = 0;
    }
    Interval(int s, int e){
        this.start = s;
        this.end = e;
    }
}