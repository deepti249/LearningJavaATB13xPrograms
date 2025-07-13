package Task_7July;
/*
6. Multiple Inheritance Using Interfaces
🔶 Objective:
Show how a class in Java can implement multiple interfaces to achieve multiple inheritance.
🔶 Steps:
Create two interfaces: Printable and Showable.
Each interface should have a method: print() and show() respectively.
Create a class Document that implements both interfaces.
Implement both methods in the Document class.
In the main() method, create a Document object and call both methods.
🔶 Expected Output:
Printing Document
Showing Document
 */

public class Lab_6_MultipleInheritanceUsingInterfaces {
    public static void main(String[] args)
    {
        Document doc = new Document();
        doc.print();
        doc.show();
    }
}

// First interface
interface Printable
{
    void print();
}

// Second interface
interface Showable
{
    void show();
}

// Class implementing both interfaces
class Document implements Printable, Showable
{
    // Implementing print() from Printable
    public void print()
    {
        System.out.println("Printing Document");
    }

    // Implementing show() from Showable
    public void show()
    {
        System.out.println("Showing Document");
    }
}