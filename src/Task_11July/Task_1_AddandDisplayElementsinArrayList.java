package Task_11July;
/*
 1. Add and Display Elements in ArrayList
📘 Description:
Create an ArrayList of student names. Add the following 5 students:
Dipak, Ravi, Sneha, Priya, Anjali.
Then display all names using a loop and Iterator
✅ Expected Output:
Student List:
Dipak
Ravi
Sneha
Priya
Anjali
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task_1_AddandDisplayElementsinArrayList {
    public static void main(String[] args)
    {
        List al = new ArrayList();
        al.add("Dipak");
        al.add("Ravi");
        al.add("Sneha");
        al.add("Priya");
        al.add("Anjali");

        System.out.println(al);

        for(int i=0; i<al.size();i++)
        {
            System.out.println(al.get(i));
        }

        System.out.println("---------");

        Iterator iterator = al.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
