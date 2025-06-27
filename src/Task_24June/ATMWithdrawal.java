package Task_24June;

/*ATM Withdrawal Simulation. (Follow Below Steps to Write Program)

Steps to Write the Program

1️⃣ Initialize the account balance with a fixed amount (e.g., ₹10,000).
2️⃣ Take user input for the amount they want to withdraw.
3️⃣ Check withdrawal conditions:
The amount should be greater than zero.
The amount should be a multiple of 100 (common ATM rule).
The amount should not exceed the account balance.
4️⃣ Deduct the amount from the balance if conditions are met.
5️⃣ Display the updated balance or an error message if the withdrawal fails.
 */

import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args)
    {
        int balance = 10000;  // Step 1: Initialize account balance
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount you want to withdraw: ");
        int amount = scanner.nextInt();  // Step 2: Take input from user

        // Step 3: Check withdrawal conditions

        if (amount <= 0) {
            System.out.println("❌ Withdrawal amount must be greater than zero.");
        } else if (amount % 100 != 0) {
            System.out.println("❌ Withdrawal amount must be a multiple of 100.");
        } else if (amount > balance) {
            System.out.println("❌ Insufficient balance. Your current balance is ₹" + balance);
        } else {
            // Step 4: Deduct amount and update balance
            balance -= amount;

            // Step 5: Show updated balance
            System.out.println("✅ Withdrawal successful!");
            System.out.println("💰 Updated balance: ₹" + balance);
        }
    }
}
