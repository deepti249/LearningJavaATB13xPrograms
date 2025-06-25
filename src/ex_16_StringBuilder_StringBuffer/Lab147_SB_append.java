package ex_16_StringBuilder_StringBuffer;

public class Lab147_SB_append {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Deepti");
        stringBuffer.append(123);
        System.out.println(stringBuffer);

        StringBuilder stringBuilder = new StringBuilder("Pramod");
        stringBuilder.append(123);
        System.out.println(stringBuilder);
    }
}
