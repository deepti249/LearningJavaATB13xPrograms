package ex_26_IIB;

//IIB -> Instance initialization Block
//I will be executed whenever Object is created.

public class Lab203_IIB {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
    }

}

class A{
    A(){
        System.out.println("DC");
    }

    {
        System.out.println("Hi, I am IIB");
        System.out.println("If you want to execute or call something when object is created");
        // mysql connection
        // read a csv, xlsx file
        // read json, xml.
        // read a text file or env file

    }

    {
        System.out.println("Hi, I am IIB 2");
    }

    {
        System.out.println("Hi, I am IIB 3");
    }

    static {
        System.out.println("Static Block");
    }
}
//Static block will be executed first only once when a class is loaded irrespective of no of objects created.
//IIB block or blocks get executed when an object is created. In this case, twice as two objects are created.
//Constructor is called after IIB block gets executed.