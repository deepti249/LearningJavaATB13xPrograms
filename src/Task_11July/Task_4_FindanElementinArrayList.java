package Task_11July;
/*
4. Find an Element in ArrayList
📘 Description:
Create an ArrayList of cities: Mumbai, Delhi, Pune.
Check if Pune is present in the list. Print a message accordingly.
(you can use If Condition to check the Pune city and you can take the City name from User)
✅ Expected Output:
Pune is in the list.
 */
import java.util.ArrayList;

public class Task_4_FindanElementinArrayList {
    public static void main(String[] args)
    {
        ArrayList al = new ArrayList();
        al.add("Mumbai");
        al.add("delhi");
        al.add("Pune");

        System.out.println(al);

        if(al.contains("Pune"))
        {
            System.out.println("Pune is in the list.");
        }
        else
        {
            System.out.println("Pune is Not in the list.");
        }

    }
}
