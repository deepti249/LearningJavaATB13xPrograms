package ex_16_StringBuilder_StringBuffer;

import java.util.Scanner;

public class Interview_Vowels_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Input!");
        String input = scanner.next();

        int vowels = 0;
        int consonants = 0;

        input = input.toLowerCase();
        System.out.println(input);

        for (int i = 0; i <input.length() ; i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }
        System.out.println("Number of vowels : " + vowels);
        System.out.println("Number of consonants : " + consonants);
    }
}
