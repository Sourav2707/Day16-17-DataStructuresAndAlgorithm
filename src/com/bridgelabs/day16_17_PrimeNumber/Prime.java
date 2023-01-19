package com.bridgelabs.day16_17_PrimeNumber;

import java.util.ArrayList;
import java.util.Arrays;

public class Prime {
    public ArrayList<Integer> primeCheckList = new ArrayList<>();
    boolean match;
    public void isPrime(int n) {
        for(int i = 2; i < n; i++) { //skipped 1, 2 beacuse they are not prime
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    match = false;
                    break;
                }
                else
                    match = true;
            }
            if(match == true) {
                primeCheckList.add(i);
                System.out.print(i + " ");
            }
        }
        }
    public static void main(String[] args) {
        System.out.println("The below are the list of prime numbers within the range of 1000");
        Prime prime = new Prime();
        prime.isPrime(1000);
    }
}
