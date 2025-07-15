package ex_32_Collection_Framework_DSA.LIST;

import java.util.LinkedList;

public class Lab245_LinkedList_Operations {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList();
        animals.addFirst("Lion");
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cat");
        animals.addLast("Elephant");
        System.out.println("LinkedList: " + animals);

        // Accessing elements
        System.out.println("First element: " + animals.getFirst());
        System.out.println("Last element: " + animals.getLast());

        // Removing elements
        animals.removeFirst();
        animals.removeLast();
        System.out.println("LinkedList after removal: " + animals);

        System.out.println("Size of LinkedList: " + animals.size());
    }
}
