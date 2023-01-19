package com.bridgelabs.day16_17_BinarySearch;

public class StringBinarySearch {
    int result = 0;
    public void binarySearch(String[] arrayOfWords, String wordToSearch) {
        for(int i = 0; i < arrayOfWords.length; i++) {
            result = wordToSearch.compareTo(arrayOfWords[i]);
            if(result == 0)
                System.out.println(wordToSearch+" is found at the index of "+i);
        }
    }
}
