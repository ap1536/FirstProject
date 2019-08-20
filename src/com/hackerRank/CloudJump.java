package com.hackerRank;

public class CloudJump {
    public static void main(String[] args) {
        int a[] = {0,0,0,0,1,0};
        int counter = -1;
        for(int i=0;i<a.length;i++){
            if(i<a.length-2 && a[i+2] == 0){
                counter++;
                i++;
            }else {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
