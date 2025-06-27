package Task_23June;

public class NumberEvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = scanner.nextInt();

        if(num%2==0)
        {
            System.out.println("Even Num");
        }
        else
        {
            System.out.println("Odd Num");
        }

    }
}
