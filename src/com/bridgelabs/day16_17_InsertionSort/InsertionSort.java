package com.bridgelabs.day16_17_InsertionSort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public void sorting(String[] arryOfWords) {
        String[] words = arryOfWords; //storing the words from file in local array
        for (int i = 1 ; i < words.length; i++) {
            String currentValue = words[i];
            int j = i - 1;
            while (j >= 0 && words[j].compareTo(currentValue) > 0) {
                words[j + 1] = words[j];
                j--;
            }
            words[j + 1] = currentValue;
        }
        System.out.println(Arrays.toString(words));
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Sourav Prasanna\\IdeaProjects\\Day16-17-DataStructure And Algorithm\\src\\com\\bridgelabs\\day16_17_BinarySearch\\ListOfStringToSearch");
        Scanner scanner = new Scanner(file);
        String[] arrayOfWords = scanner.next().split(",");
        System.out.println(Arrays.toString(arrayOfWords));
        InsertionSort sort = new InsertionSort();
        sort.sorting(arrayOfWords);
    }
}
