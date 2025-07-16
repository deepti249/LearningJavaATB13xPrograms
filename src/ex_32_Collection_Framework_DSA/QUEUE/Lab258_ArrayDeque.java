package ex_32_Collection_Framework_DSA.QUEUE;

import java.util.ArrayDeque;

public class Lab258_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> deck = new ArrayDeque();
        deck.push(15);
        deck.push(10);
        deck.push(10);
        deck.push(5);
        deck.push(20);
      //  deck.push(null);
        System.out.println(deck);

        //ArrayDeque prints the elements in Reverse order.
        //It allows duplicates
    }
}
