package Test_Coding_Strings_Attempt1;

public class Task_String_Basic_Op {
    public static void main(String[] args) {

        //String Concatenation
        String firstName = "Deepti";
        String lastName = " Lodha";

        System.out.println("First name : " + firstName);
        System.out.println("Last name : " + lastName);

        String fullName = firstName.concat(lastName);
        System.out.println("Full name : " + fullName);

        //Length of string
        int length = fullName.length();
        System.out.println("Length of Full Name: " + length);

        // Character Extraction
        char firstChar = fullName.charAt(0);  // first character
        System.out.println("First character of full name: " + firstChar);

        char lastChar = fullName.charAt(fullName.length() - 1);
        System.out.println("Last character of full name: " + lastChar);

        // Substring
        String sub = fullName.substring(0, 6);  // from index 0 to 5
        System.out.println("Substring (first name): " + sub);
    }
}
