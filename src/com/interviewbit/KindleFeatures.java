package com.interviewbit;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class KindleFeatures {
    public static void main(String[] args) {
        int numFeatures = 5;
        int topFeatures = 2;
        List<String> possibleFeatures = new ArrayList<String>();
        int numFeatureRequests = 3;
        List<String> featureRequests = new ArrayList<String>();

        possibleFeatures.add("anac");
        possibleFeatures.add("batac");
        possibleFeatures.add("cetra");
        possibleFeatures.add("delta");
        possibleFeatures.add("eruo");

        featureRequests.add("I wish my anac");
        featureRequests.add("I wish batac is more");
        featureRequests.add("I anac");


        ArrayList<Integer> featureCounts = new ArrayList<Integer>();
        for (String feature:possibleFeatures) {
            List<Integer> eachFeatureCount = IntStream.range(0,featureRequests.size()).boxed().filter(i -> featureRequests.get(i).toLowerCase().contains(feature.toLowerCase())).collect(Collectors.toList());
            featureCounts.add(eachFeatureCount.size());
        }
        ArrayList<String> outputList = new ArrayList<String>();
        for (int i=0; i<topFeatures;i++){
            if(Collections.max(featureCounts) != 0){
                int index = featureCounts.indexOf(Collections.max(featureCounts));
                outputList.add(possibleFeatures.get(index));
                featureCounts.set(index,0);
            }
        }
        for (String str : outputList) {
            System.out.println(str);
        }
    }
}
