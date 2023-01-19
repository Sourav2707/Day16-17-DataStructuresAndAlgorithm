package com.bridgelabs.day16_17_PrimeAnagramPalindrome;

public class Palindrome {
    public boolean result;
    boolean checkPalindrome(int inputNum) {
        int i = inputNum;
        int rev = 0;
        while (i > 0) {
            int remainder = i % 10;
            rev = rev * 10 + remainder;
            i = i / 10;
        }
        if (inputNum == rev) {
            result = true;
        } else
            result = false;
        return result;
    }
}
