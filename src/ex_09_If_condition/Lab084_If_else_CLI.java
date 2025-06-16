package ex_09_If_condition;

public class Lab084_If_else_CLI {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if (age > 18)
        {
            System.out.println("Yes you can go to GOA!");
        }else
        {
            System.out.println("You can't Go to GOA!!");
        }
    }
}
