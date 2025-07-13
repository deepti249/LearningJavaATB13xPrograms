package ex_25_Abstraction.Interface;

public class Lab200_Interface_Multiple_Inheritance {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.money();
    }
}

interface Father1{
    void money();
}
interface Father2{
    void money();
}

//Multiple inheritance is possible in java using Interfaces
class Child implements Father1,Father2{

    @Override
    public void money() {
        System.out.println("Child's own Money!");
    }
}