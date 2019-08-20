package com.hackerRank;

public class RepeatedString {
    public static void main(String[] args) {
        String str = "a";
        int len = 10;
        StringBuilder op = new StringBuilder();
        for(int i = 0; op.length()<len; i++){
            op.append(str);
        }
        int count = 0;
        for (int j = 0; j<len;j++){
            if(op.charAt(j) == 'a'){
                count++;
            }
        }
        System.out.println(count);
    }
}
