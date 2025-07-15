package Task_11July;
/*
3. Reverse a LinkedList
📘 Description:
Create a LinkedList and add the following numbers:
10, 20, 30, 40.
Reverse the list and print the output.
✅ Expected Output:
Reversed List:
[40, 30, 20, 10]
 */
import java.util.LinkedList;

public class Task_3_ReverseaLinkedList {
        public static void main(String[] args){
            LinkedList ll = new LinkedList();
            ll.add(10);
            ll.add(20);
            ll.add(30);
            ll.add(40);

            System.out.println(ll);

            System.out.println(ll.reversed());

        }
}
