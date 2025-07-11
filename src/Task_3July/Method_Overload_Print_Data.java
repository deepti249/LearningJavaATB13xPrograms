package Task_3July;

/*Task 2: Print Data
Title: Create a universal printer with overloading
Description:
Create a class Printer with multiple printData() methods to handle different data types:
printData(String data)
printData(int data)
printData(float data)
Demonstrate in the main() method how the same method name behaves differently
depending on the parameter type.
 */

public class Method_Overload_Print_Data {
    public static void main(String[] args) {

        Printer p1 = new Printer();
        p1.printData(10);
        p1.printData(20f);
        p1.printData("Deepti");


    }
}

class Printer
{
    String printData(String data)
    {
        System.out.println(data);
        return data;
    }

    int printData(int data)
    {
        System.out.println(data);
        return data;
    }

    float printData(float data)
    {
        System.out.println(data);
        return data;
    }
}