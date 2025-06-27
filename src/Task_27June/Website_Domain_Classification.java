package Task_27June;
/*
Determine the Type of Website Based on Domain (.com, .org, .edu, etc.)
* Take the Site URL input from the user

Example Scenarios
Input: example.com
Output: The website type is: Commercial website

Input: example.org
Output: The website type is: Non-profit organization

Input: example.edu
Output: The website type is: Educational institution

Input: example.gov
Output: The website type is: Government website

Input: example.net
Output: The website type is: Network-related website

Input: example.info
Output: The website type is: Informational website

Input: example.xyz
Output: The website type is: Unknown or other types of websites
 */

import java.util.Scanner;

public class Website_Domain_Classification {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter website url:");
        String domain=sc.next();

        if(domain.contains(".com"))
        {
            System.out.println("The website type is: Commercial website");
        }else if(domain.contains(".org"))
        {
            System.out.println("The website type is: Non-profit organization");
        }else if(domain.contains(".edu"))
        {
            System.out.println("The website type is: Educational institution");
        }else if(domain.contains(".gov"))
        {
            System.out.println("The website type is: Government website");
        }else if(domain.contains(".net"))
        {
            System.out.println("The website type is: Network-related website");
        }else if(domain.contains(".info"))
        {
            System.out.println("The website type is: Informational website");
        }else {
            System.out.println("The website type is: Unknown or other types of websites");
        }
        sc.close();
    }
}
