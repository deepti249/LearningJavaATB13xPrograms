package ex_32_Collection_Framework_DSA.SET;

import java.util.HashSet;
import java.util.Set;


public class Lab254_SET {
    public static void main(String[] args) {
        Set hs = new HashSet();

        hs.add("Pramod");
        hs.add("Pramod"); //Set removes duplicates
        hs.add("Dutta");

        System.out.println(hs);


    }
}
