package ex_017_Arrays;

public class Lab152_String_Array {
    public static void main(String[] args) {
        String[] names = {"Pramod","Amit","Kalpesh" }; // Fixed Size  3, 0 to 2

        System.out.println(names.length);
        System.out.println(names[0]); //printing elements of the array
        System.out.println(names[1]);
        System.out.println(names[2]);

        System.out.println("-------------------");

        boolean[] is_male_data = new boolean[2];
        is_male_data[0] =  true;
        is_male_data[1] =  false;

        System.out.println(is_male_data.length);
        System.out.println(is_male_data[0]);
        System.out.println(is_male_data[1]);
    }
}
