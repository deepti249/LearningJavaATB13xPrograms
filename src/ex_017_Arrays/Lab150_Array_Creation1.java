package ex_017_Arrays;

public class Lab150_Array_Creation1 {
    public static void main(String[] args) {
        int[] marks = {91, 90, 51, 100, 91, 92, 89};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[6]);
      //  System.out.println(marks[10]); java.lang.ArrayIndexOutOfBoundsException

        System.out.println("-------------------");

        boolean[] is_married_people = {true,false};
        System.out.println(is_married_people.length);
        System.out.println(is_married_people[0]);
        System.out.println(is_married_people[1]);


        char c = 'A';
        String name = "pramod";
    }
}
