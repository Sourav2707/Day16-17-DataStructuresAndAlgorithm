package com.bridgelabs.day16_17_BinarySearch;

import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Sourav Prasanna\\IdeaProjects\\Day16-17-DataStructure And Algorithm\\src\\com\\bridgelabs\\day16_17_BinarySearch\\ListOfStringToSearch");
        Scanner scanner = new Scanner(file);
        String[] arrayOfWords = scanner.next().split(",");
        Arrays.sort(arrayOfWords);
        System.out.println(arrayOfWords);
        Scanner sc = new Scanner(System.in);
        StringBinarySearch search = new StringBinarySearch();
        System.out.println("Enter the word to search");
        String wordToSearch = sc.next();
        search.binarySearch(arrayOfWords,wordToSearch);
    }
}
