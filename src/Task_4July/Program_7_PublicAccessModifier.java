package Task_4July;

/*
Program 7: Demonstrate public Access Modifier
:- Understand how public methods are accessible from anywhere.
📝 Instructions:
Create a class Student with a public method showInfo() that prints "Public Access: Student Info".
In the main() method, create an object of Student.
Call showInfo() directly from anywhere like same class, sub class, different class same package,
in different package it should work without restriction.
 */

public class Program_7_PublicAccessModifier {
    public static void main(String[] args)
    {
        Student_1 s1 = new Student_1();
        s1.showInfo();
    }
}

class Student_1
{
    public void showInfo()
    {
        System.out.println("Public Access: Student Info");
    }
}