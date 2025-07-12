package ex_19_OOPS_Constructor;

public class Lab176_DC_Real {
    public static void main(String[] args) {
        WebAutomation w1 = new WebAutomation();
    }
}



class WebAutomation{
    // DC
    WebAutomation(){
        System.out.println("I want to read a CSV File");
        System.out.println("Open the Page before loading the scripts");
        System.out.println("Y0u can do anything which you want to do, when Object is created.");

        //FileInputStream fileInputStream = new FileInputStream("C://a.txt");

    }

}