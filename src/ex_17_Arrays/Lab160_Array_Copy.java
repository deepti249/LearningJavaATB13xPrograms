package ex_17_Arrays;

public class Lab160_Array_Copy {
    public static void main(String[] args) {
        int[] original = {1,2,3};
        int[] copy = new int[original.length];
     //System.arraycopy(obj source,int src position,object destination,int destination position,int length);
        System.arraycopy(original,0,copy,0,original.length);

        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i]);
        }
    }
}
