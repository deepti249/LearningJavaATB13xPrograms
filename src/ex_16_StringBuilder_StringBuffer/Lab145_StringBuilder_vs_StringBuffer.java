package ex_16_StringBuilder_StringBuffer;

public class Lab145_StringBuilder_vs_StringBuffer {
    public static void main(String[] args) {
        String s0 = "Deepti";
        System.out.println(s0);

        String s1 = new String("Deepti");
        System.out.println(s1);

        StringBuilder stringBuilder = new StringBuilder("Deepti");
        System.out.println(stringBuilder);

        StringBuffer stringBuffer = new StringBuffer("Deepti");
        System.out.println(stringBuffer);
    }
}
