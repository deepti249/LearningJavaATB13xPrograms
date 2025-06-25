package ex_16_StringBuilder_StringBuffer;

public class Lab148_StringBuilder_Reverse {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // add text at the end
        sb.reverse(); //reverse text
        System.out.println(sb);
    }
}
