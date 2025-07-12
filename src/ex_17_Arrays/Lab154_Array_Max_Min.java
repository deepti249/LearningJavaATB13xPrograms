package ex_17_Arrays;

public class Lab154_Array_Max_Min {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49}; // 0 to 9

        int max_no = find_max(array);
        System.out.println(max_no);

        int min_no = find_min(array);
        System.out.println(min_no);
    }


    public static int find_max(int[] array) {

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int find_min(int[] array) {

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
