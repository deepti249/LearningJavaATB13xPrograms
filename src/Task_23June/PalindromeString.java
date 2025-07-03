package Task_23June;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args)
    {//  Palindrome
        //  madam ->  reverse(madam) -> madam ==
        //  s1 = madam
        // s1_reverse = madam
        //  s1 == s1_reverse
        // G

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter String");

        String str = scanner.next();
        String org_string = str;
        String rev ="";

        int length =str.length();

        for(int i=length-1;i>=0;i--)
        {
            rev= rev+str.charAt(i);
        }

        System.out.println(rev);

        if(org_string.equals(rev))
        {
            System.out.println(org_string + " is Palindrome");
        }
        else
        {
            System.out.println(org_string + " is not Palindrome");
        }
    }
}
