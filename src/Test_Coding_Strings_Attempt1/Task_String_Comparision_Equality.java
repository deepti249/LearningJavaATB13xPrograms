package Test_Coding_Strings_Attempt1;

public class Task_String_Comparision_Equality {

    public static void main(String[] args) {
        String s1 = "Hello"; //SCP
        String s2 = "hello"; //SCP
        String s3 = "Hello"; //SCP
        String s4 = new String("Hello"); // OA
        String s5 = new String("hello"); //OA

        // 1. Using == operator ->This checks the locations ref of two strings.
        System.out.println("1. Using == operator:");
        System.out.println("string1 == string2: " + (s1 == s2));
        System.out.println("string1 == string3: " + (s1 == s3)); //true
        System.out.println("string1 == string4: " + (s1 == s4)); //true
        System.out.println("string1 == string5: " + (s1 == s5));
        System.out.println("string2 == string3: " + (s2 == s3));
        System.out.println("string2 == string4: " + (s2 == s4));
        System.out.println("string2 == string5: " + (s2 == s5));//true
        System.out.println("string3 == string4: " + (s3 == s4));//true
        System.out.println("string3 == string5: " + (s3 == s5));
        System.out.println("string4 == string5: " + (s4 == s5));
        System.out.println();

        // 2. Using equals() method -> Check the content or value of two strings
        System.out.println("2. Using equals() method:");
        System.out.println("string1.equals(string2): " + s1.equals(s2)); // false
        System.out.println("string1.equals(string3): " + s1.equals(s3)); // true
        System.out.println("string1.equals(string4): " + s1.equals(s4));
        System.out.println("string1.equals(string5): " + s1.equals(s5));
        System.out.println("string2.equals(string3): " + s2.equals(s3));
        System.out.println("string2.equals(string4): " + s2.equals(s4));
        System.out.println("string2.equals(string5): " + s2.equals(s5));
        System.out.println("string3.equals(string4): " + s3.equals(s4));
        System.out.println("string3.equals(string5): " + s3.equals(s5));
        System.out.println("string4.equals(string5): " + s4.equals(s5));
        System.out.println();


        // 3. Using equalsIgnoreCase() method ->Ignores case sensitivity
        System.out.println("3. Using equalsIgnoreCase() method:");
        System.out.println("string1.equalsIgnoreCase(string2): " + s1.equalsIgnoreCase(s2)); // true
        System.out.println("string2.equalsIgnoreCase(string3): " + s2.equalsIgnoreCase(s3)); // true
        System.out.println("string2.equalsIgnoreCase(string4): " + s2.equalsIgnoreCase(s4)); // true
        System.out.println();

        // 4. Using compareTo() method ->compares ASCII values lexicographically.
        System.out.println("4. Using compareTo() method:");
        System.out.println("string1.compareTo(string2): " + s1.compareTo(s2)); // negative (H < h)
        System.out.println("string1.compareTo(string3): " + s1.compareTo(s3)); // 0
        System.out.println("string2.compareTo(string3): " + s2.compareTo(s3)); // positive (h > H)
    }



}
