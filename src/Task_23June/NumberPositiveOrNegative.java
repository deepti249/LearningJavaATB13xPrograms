package Task_23June;

public class NumberPositiveOrNegative {
    public static void main(String[] args) {
        // If the number is greater than 0 → it's positive.
        // Else if the number is less than 0 → it's negative.
        // Else → it's zero.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = scanner.nextInt();

        if(num>0)
        {
            System.out.println(num + " it's positive.");
        }
        else if (num<0)
        {
            System.out.println(num + " it's negative.");
        }
        else
        {
            System.out.println("it's zero.");
        }
    }
}
