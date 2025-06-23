package ex_15_Strings;

public class Lab144_String_All_Functions {
    public static void main(String[] args) {
        //Length function gives total character in a string.Starts with 1
        //charAt function gives character present at that index. Index always starts from zero.
        String name = "Sonal";// 0,1,2,3,4
        System.out.println(name.length()); //5
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(4));
//      System.out.println(name.charAt(10)); // java.lang.StringIndexOutOfBoundsException

        System.out.println(name.concat("Patel"));

        // 3. contains()
        System.out.println(name.contains("om"));  //false
        System.out.println(name.contains("on"));  //true

        // 4. equals()
        System.out.println(name.equals("Sonal")); //true

        // 5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("sonal")); //true

        // 6. indexOf() //  sonal -> ? o
        System.out.println(name.indexOf('o')); //1

        String s1 = "madam";
        // Returns the index within this string of the first occurrence of the
        // specified substring.
        System.out.println(s1.indexOf("m")); //0

        System.out.println(s1.lastIndexOf("m")); //4

        // 7. length()
        System.out.println(name.length()); //5

        // 8. replace( , ) // sonal
        System.out.println(name.replace('n', 'N')); //SoNal

        // 9. split()
        String name4 = "pramod@live.com@123";
        String[] split_name = name4.split("@");
        System.out.println(split_name[0]);
        System.out.println(split_name[1]);
        System.out.println(split_name[2]);

        // 10. substring( , )  , sonal
        System.out.println(name.substring(1,3)); //on
        // it returns substring which starts from the start index but
        // it ends with (index-1) of end index.

        // 11. toLowerCase()
        System.out.println("SONAL".toLowerCase());

        // 12. toUpperCase()
        System.out.println("sonal".toUpperCase());

        // 14. startsWith()
        System.out.println(name.startsWith("S"));  //true

        // 14. endsWith()
        System.out.println(name.endsWith("a"));  //false

        //15. Palindrome
        String anotherPalindrome = "Niagara. O roar again!";
        System.out.println(anotherPalindrome.length()); //22 -> It counts blank spaces also.

        String extract = anotherPalindrome.substring(11,15);
        System.out.println(extract); //roar -> 11 to 14 only

        //16. Concatenation (By using +)

        String s111 = "Hello";
        String s222 = "World";

        String s333 = "ji";
        String result1 = s111 + s333 + s222;
        System.out.println(result1);

        //17. lastIndexOf
        String n = "PRamoddUTTA";
        System.out.println(n.indexOf("d"));//5
        System.out.println(n.lastIndexOf("d"));//6
        System.out.println(n.lastIndexOf("s"));//-1


    }
}
