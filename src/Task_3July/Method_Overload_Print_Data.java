package Task_3July;

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