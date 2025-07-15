package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab241_LIST {
    public static void main(String[] args) {
        List l = new ArrayList(); // Dynamic Dispatch
        l.add("hello");
        l.add(123);
        l.add(true);
        l.add("Blah Blah");
        System.out.println(l);
    }
}
