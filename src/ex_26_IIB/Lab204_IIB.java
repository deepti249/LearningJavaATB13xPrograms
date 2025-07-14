package ex_26_IIB;

public class Lab204_IIB {
    public static void main(String[] args) {
        new A1();
    }
}

class A1{
    A1(){
        System.out.println("DC");
    }

    {
        System.out.println("Hi, I am IIB");
    }

    static {
        System.out.println("Hi, I am SIB");
    }

}
//SIB then IIB then DC will be executed