package com.interviewbit;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IsPrimeJ8 {
    public static void main(String[] args) {
        int number = 17;
        if(IntStream.rangeClosed(2, number/2).noneMatch(i -> number%i == 0)){
            System.out.println("Yes");
        }else {
            System.out.println("Nope");
        }
        List<Integer> primes = IntStream.rangeClosed(2, number)
                .filter(n -> isPrime(n))
                .boxed()
                .collect(Collectors.toList());
        int[] opArray = primes.stream().mapToInt(i->i).toArray();
        for (int i = 0; i < opArray.length; i++) {
            System.out.println(opArray[i]);
        }
    }

    private static boolean isPrime(int number) {
            if(number <= 2)
                return number == 2;
            else
                return  (number % 2) != 0
                        &&
                        IntStream.rangeClosed(3, (int) Math.sqrt(number))
                                .filter(n -> n % 2 != 0)
                                .noneMatch(n -> (number % n == 0));
    }
}
