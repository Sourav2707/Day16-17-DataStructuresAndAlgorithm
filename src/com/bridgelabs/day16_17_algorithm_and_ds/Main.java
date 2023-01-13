package com.bridgelabs.day16_17_algorithm_and_ds;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to day 16 & 17 algorithm and data structure program");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        Permutation.findPermutations(str);
        Permutation.recursivePermutation("", str);
        Permutation.checkEqual();
    }
}
