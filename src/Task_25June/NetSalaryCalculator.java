package Task_25June;
/*  Calculate Employee Net Salary (Basic Pay, HRA, DA, Tax Deductions,)
Research from your side for this program.
 */
import java.util.Scanner;

public class NetSalaryCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input Basic Pay
        System.out.print("Enter Basic Pay: ₹");
        double basicPay = sc.nextDouble();

        if (basicPay <= 0) {
            System.out.println("Invalid Basic Pay. It must be positive.");
            sc.close();
            return;
        }

        // Calculate allowances
        double hra = 0.40 * basicPay;
        double da = 0.20 * basicPay;

        // Calculate Gross Salary
        double grossSalary = basicPay + hra + da;

        // Calculate Tax (assuming 10% flat tax)
        double tax = 0.10 * grossSalary;

        // Calculate Net Salary
        double netSalary = grossSalary - tax;

        // Display all components
        System.out.println("\n--- Salary Details ---");
        System.out.printf("Basic Pay: ₹%.2f%n", basicPay);
        System.out.printf("HRA (40%% of Basic): ₹%.2f%n", hra);
        System.out.printf("DA (20%% of Basic): ₹%.2f%n", da);
        System.out.printf("Gross Salary: ₹%.2f%n", grossSalary);
        System.out.printf("Tax Deducted (10%% of Gross): ₹%.2f%n", tax);
        System.out.printf("Net Salary: ₹%.2f%n", netSalary);

        sc.close();

    }
}
