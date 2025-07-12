package ex_21_Polymorphism.Method_OverRiding;

public class Lab190_Method_Overriding_Automation {
    public static void main(String[] args) {
        CommonToAll commonToAll = new CommonToAll();
        commonToAll.openBrowser();

        Chrome c1 = new Chrome();
        c1.openBrowser();

        Firefox f1 = new Firefox();
        f1.openBrowser();

        // Dynamic Dispatch
        CommonToAll c2 = new Chrome();
        c2.openBrowser();

        CommonToAll c3 = new Firefox();
        c3.openBrowser();

    }
}

class CommonToAll{
    void openBrowser(){
        System.out.println("Starting IE Browser!!");
    }
}

class Chrome extends CommonToAll{

    @Override
    void openBrowser(){
        System.out.println("Starting Chrome Browser!!");
    }

}

class Firefox extends CommonToAll{
    @Override
    void openBrowser(){
        System.out.println("Starting Firefox Browser!!");
    }
}