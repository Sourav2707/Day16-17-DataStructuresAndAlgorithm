package com.bridgelabs.day16_17_BubbleSort;

import com.bridgelabs.day16_17_InsertionSort.InsertionSort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public void sorting(int[] ar) {
        for (int i=0; i< ar.length; i++){
            for (int j = 0; j < ar.length-1; j++) {
                if (ar[j] > ar[j+1]){
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(ar));
    }
    public static void main(String[] args) throws FileNotFoundException {
            int[] arrayOfnumbers = { 34, 23, 6, 22, 98, 35};
            System.out.println(Arrays.toString(arrayOfnumbers));
            BubbleSort sort = new BubbleSort();
            sort.sorting(arrayOfnumbers);
    }
}
