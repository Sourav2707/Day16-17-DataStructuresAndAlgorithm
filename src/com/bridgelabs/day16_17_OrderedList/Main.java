package com.bridgelabs.day16_17_OrderedList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        OrderedList<String> orderedList=new OrderedList();
        Scanner scanner=new Scanner(System.in);

        File file=new File("C:\\Users\\Sourav Prasanna\\IdeaProjects\\Day16-17-DataStructure And Algorithm\\src\\com\\bridgelabs\\day16_17_BinarySearch\\ListOfStringToSearch");
        Scanner fileScan=new Scanner(file);
        String arr[]=fileScan.nextLine().split(",");
        Arrays.sort(arr);

        for (String key: arr) {
            orderedList.append(key);
        }

        System.out.println("Ordered List:");
        System.out.println(orderedList);
        System.out.println("Enter Country Name :");
        String name=scanner.nextLine();
        Node node=orderedList.search(name);
        if (node != null){
            String data= (String) node.getData();
            System.out.println("found: "+data);
            orderedList.delete(data);
            System.out.println("Deleted: "+data );
        }else {
            System.out.println(name+" not found");
            orderedList.insert(name);
            System.out.println("Added: "+name);
        }
        System.out.println(orderedList);
    }
}
