package ex_16_StringBuilder_StringBuffer;

import java.sql.SQLOutput;

public class Lab149_SB_delete_replace {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("java");
        sb.append(" Programming");
        System.out.println(sb);

        sb.delete(5,16);
        System.out.println(sb);

        sb.replace(0,4,"C++");
        System.out.println(sb);
    }
}
