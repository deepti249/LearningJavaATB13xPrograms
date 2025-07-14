package ex_27_Static;

public class Lab208_REAL {
    public static void main(String[] args) {
        ATB atb = new ATB();
    }

}

class ATB{

    static {
        System.out.println("Load the class?, I will execute");
    }
    {
        System.out.println("IIB - this is called when Object is created!");
        // What is the purpose? -
        // Here you can write code related to
        // start a website or anything before starting the
        // web automation or api automation
        //
    }

    private String phone; //non static
    private String name; // non static

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static String courseName = "ATB13x"; //Static -> common
    static String mentorName = "Pramod";//Static -> common

    static void doAssignment(){
        //System.out.println(phone); // Static method can't access the non-static variables and non-static methods
        System.out.println("Do Assignment");
    }

    static void joinZoomForClass(){
        System.out.println("Class Joined!");
    }

    void howTheyDoAssignment(){
        System.out.println("It is different!");
    }
}