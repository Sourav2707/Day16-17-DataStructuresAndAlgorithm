package com.bridgelabs.day16_17_Anagram;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    public boolean result;
    public boolean checkAnagram(String word1, String word2) {
        char[] char1 = word1.toCharArray();
        char[] char2 = word2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        if(char1.length == char2.length && Arrays.equals(char1, char2))
            result = true;
        else
            result = false;
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Enter two anagram words to check");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word 1");
        String word1 = scanner.next();
        System.out.println("Enter word 2");
        String word2 = scanner.next();
        Anagram anagram = new Anagram();
        anagram.checkAnagram(word1, word2);
        if(anagram.result)
            System.out.println(word1+" and "+word2+" are anagrams");
        else
            System.out.println(word1+" and "+word2+" are not anagrams");
    }
}
