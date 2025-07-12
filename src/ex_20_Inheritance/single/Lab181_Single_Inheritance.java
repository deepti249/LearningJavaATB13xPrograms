package ex_20_Inheritance.single;

public class Lab181_Single_Inheritance {
    public static void main(String[] args) {
        CommonToAll c1 = new CommonToAll();
        c1.startBrowser();
        c1.readExcelFile();
        c1.readDataBaseFile();
        c1.closeBrowser();

        TestCase1 t1 = new TestCase1();
        t1.runningTC1();
        t1.startBrowser();
        t1.readExcelFile();
        t1.readDataBaseFile();
        t1.closeBrowser();
    }
}
