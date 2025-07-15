package Task_11July;
/*
2. Remove an Element from ArrayList
📘 Description:
Create an ArrayList with these names: Amit, Neha, Suresh.
Remove the name Neha and display the updated list.
✅ Expected Output:
Names after removal: [Amit, Suresh]
 */

import java.util.ArrayList;

public class Task_2_RemoveanElementfromArrayList {
    public static void main(String[] args)
    {
        ArrayList <String> al = new ArrayList();
        al.add("Amit");
        al.add("Neha");
        al.add("Suresh");

        System.out.println(al);

        al.remove("Neha");

        System.out.println(al);
    }
}
