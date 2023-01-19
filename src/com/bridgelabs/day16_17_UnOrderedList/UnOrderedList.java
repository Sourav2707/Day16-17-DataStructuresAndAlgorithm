package com.bridgelabs.day16_17_UnOrderedList;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class UnOrderedList {

    public static void main(String[] args) throws IOException {
        UnOrderedList unOrderedList=new UnOrderedList();
        LinkedList linkedList=new LinkedList();
        Scanner scanner=new Scanner(System.in);

        File file=new File("C:\\Users\\Sourav Prasanna\\IdeaProjects\\Day16-17-DataStructure And Algorithm\\src\\com\\bridgelabs\\day16_17_BinarySearch\\ListOfStringToSearch");
        Scanner fileScan=new Scanner(file);
        String arr[]=fileScan.nextLine().split(",");
        Arrays.sort(arr);

        //add words to linked-list
        for (String s: arr) {
            linkedList.append(s);
        }
        System.out.println("Words: "+linkedList);

        //search
        System.out.println("\nEnter Word to Search: ");
        String word1=scanner.next();
        Node node = linkedList.search(word1);
        if (node == null){
            System.out.println("data not found");
            linkedList.append(word1);
            System.out.println("Added "+word1);
        } else {
            String word= (String) node.getData();
            System.out.println("found: "+word);
            linkedList.delete(word);
            System.out.println("deleted: "+word);

        }

        System.out.println("Words: "+linkedList);

        //save to file
        FileWriter writer=new FileWriter(file);
        writer.write(linkedList.toString());
        writer.close();
        System.out.println("Saved to file");
    }
}

