package ex_017_Arrays;

public class Lab151_Array_Creation_2 {
    public static void main(String[] args) {
        //1st way to create the array
        //int[] marks = {1, 2, 3, 4, 5, 6};

        // 2nd way to create the array
        int[] marks = new int[5];// Fixed Size , 5, 0 to 4

        String[] names = new String[3]; // Fixed Size  3, 0 to 2
        names[0] = "Pramod"; //adding elements to the array
        names[1] = "Amit";
        names[2] = "Kalpesh";

        System.out.println(names[0]); //printing elements of the array
        System.out.println(names[1]);
        System.out.println(names[2]);

    }
}
