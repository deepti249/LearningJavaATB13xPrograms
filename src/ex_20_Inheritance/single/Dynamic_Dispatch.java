package ex_20_Inheritance.single;

public class Dynamic_Dispatch {
    public static void main(String[] args) {
        TestCase1 t2 = new TestCase1();
        t2.runningTC1();
        t2.startBrowser();
        t2.readExcelFile();
        t2.readDataBaseFile();
        t2.closeBrowser();

        CommonToAll c2 = new TestCase1(); // Dynamic Dispatch (extends)
        c2.startBrowser();
        c2.readExcelFile();
        c2.readDataBaseFile();
        c2.closeBrowser();
        // c2.runningTC1();
        // Not possible -> It can access only common functions here of only CommonToAll and
        // can't access TestCase1 functions because we have created superclass reference
        // while creating subclass.

        // Webdriver driver = new ChromeDriver(); //Classic example of dynamic dispatch


        //  TestCase1 t4 = new CommonToAll(); //Not possible
        //We cannot create Superclass/Father's object by using Subclass/Child's reference.
        //Because child was not present when father was born.


    }

}
