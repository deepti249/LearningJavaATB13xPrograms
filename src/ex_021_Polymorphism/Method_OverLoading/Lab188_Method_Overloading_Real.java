package ex_021_Polymorphism.Method_OverLoading;

public class Lab188_Method_Overloading_Real {
    public static void main(String[] args) {
        Home h1 = new Home();
        h1.task();
        h1.task(3);
        h1.task(true);
    }
}

class Home {

    void task() {
        System.out.println("Task 1");
    }

    int task(int a) {
        System.out.println("Task 2");
        return a;
    }

    boolean task(boolean a) {
        System.out.println("Task 3");
        return false;
    }
}