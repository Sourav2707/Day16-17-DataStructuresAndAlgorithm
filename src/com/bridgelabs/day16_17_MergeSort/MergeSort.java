package com.bridgelabs.day16_17_MergeSort;

import com.bridgelabs.day16_17_BubbleSort.BubbleSort;
import com.bridgelabs.day16_17_InsertionSort.InsertionSort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public void sorting(String [] arr) {
        String[] words = arr;
        int half = arr.length/2;
        String[] leftHalf = new String[half];
        String[] rightHalf = new String[half];
        for(int i = 0; i < half; i++) {
            leftHalf[i] = arr[i];
        }
        for(int j = half; j < arr.length; j++) {
            rightHalf[j-half] = arr[j];
        }
        int m = 0, n = 0, o =0;
        while(n < half && o < half) {
            if(leftHalf[n].compareTo(rightHalf[o]) <= 0)
            words[m++] = leftHalf[n++];
            else
                words[m++] = rightHalf[o++];
        }
        while (n < half){
            words[m++]=leftHalf[n++];
        }
        while (o < half){
            words[m++]=rightHalf[o++];
        }
        System.out.println(Arrays.toString(words));
    }
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Sourav Prasanna\\IdeaProjects\\Day16-17-DataStructure And Algorithm\\src\\com\\bridgelabs\\day16_17_BinarySearch\\ListOfStringToSearch");
        Scanner scanner = new Scanner(file);
        String[] arrayOfWords = scanner.next().split(",");
        System.out.println(Arrays.toString(arrayOfWords));
        MergeSort sort = new MergeSort();
        sort.sorting(arrayOfWords);
    }
}
