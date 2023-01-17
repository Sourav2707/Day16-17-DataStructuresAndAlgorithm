package com.bridgelabs.day16_17_Permutation;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    static List<String> partial1 = new ArrayList<>();
    public static void findPermutations(String str)
    {
        if (str == null || str.length() == 0) {
            return;
        }
        // initialize the list with the first character of the string
        partial1.add(String.valueOf(str.charAt(0))); //s
        for (int i = 1; i < str.length(); i++)
        {
            // consider previously constructed partial permutation one by one, iterating backwards
            for (int j = partial1.size() - 1; j >= 0 ; j--)
            {
                // remove current partial permutation from the ArrayList
                String s = partial1.remove(j); //empty
                // Insert the next char of the specified string at all, possible positions of current partial permutation.
                for (int k = 0; k <= s.length(); k++)
                {
                    partial1.add(s.substring(0, k) + str.charAt(i) + s.substring(k)); //empty+o+s//s+o+empty
                }
            }
        }
    }
    static ArrayList<String> partial2 = new ArrayList<>();
    public static void recursivePermutation(String fix, String str) {
        int length = str.length();//6//5
        if (length == 1)
        {
            partial2.add(fix + str); //"soura"+"v"
        }
        else
        {
            for (int i = 0; i < length; i++)
            {
                char[] mychar = str.toCharArray();//'s''o''u''r''a''v'//'o''u''r''a''v'//'u''r''a''v'
                char c = mychar[i];//'s'//'o'//'u'//'r'
                String st = str.substring(0, i) + str.substring(i + 1);//empty+"ourav"//empty+"urav"//empty+"rav"
                recursivePermutation(fix + c, st);//"s", "ourav"//"so", "urav"//"sou", "rav"//"sour", "av"//"soura", "v"
            }
        }
    }
    public static void checkEqual() {
        for(String value : partial2) {
            System.out.println(value+" found in both iterative and recursive method "+partial1.contains(value));
        }
    }
}
