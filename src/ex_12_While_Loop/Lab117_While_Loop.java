package ex_12_While_Loop;

public class Lab117_While_Loop {
    public static void main(String[] args) {

        //While is an entry controlled loop.Need to Initialize outside the while loop.
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        //For Loop -> We can initialize outside the loop also.
        //  I, C, U
        int j = 0;
        for (; j < 10; j++) {
            System.out.println(j);
        }
    }
}
