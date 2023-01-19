package com.bridgelabs.day16_17_PrimeAnagramPalindrome;
import com.bridgelabs.day16_17_PrimeNumber.Prime;
import com.bridgelabs.day16_17_Anagram.Anagram;

import java.util.ArrayList;

public class PrimeAnagramPalindrome {
    public static void main(String[] args) {
        ArrayList<Integer> palindromes = new ArrayList<>();
        Prime primeList = new Prime();
        Anagram anagram = new Anagram();
        Palindrome palindrome = new Palindrome();
        primeList.isPrime(1000);
        int length = primeList.primeCheckList.size();
        for(int i = 0; i < length; i++) { //skipped 1, 2 beacuse they are not prime
            for (int j = 0; j < i; j++) {
                String word1 = primeList.primeCheckList.get(i).toString();
                String word2 = primeList.primeCheckList.get(j).toString();
                anagram.checkAnagram(word1, word2);
                if(anagram.result)
                    System.out.println(word1+" and "+word2+" are anagram");
            }
            if(palindrome.checkPalindrome(i))
                palindromes.add(i);
        }
        palindromes.forEach(x -> System.out.println(x+" is a palindrome number"));
    }
}
