package ex_23_Access_Modifiers;

public class Access_Modifiers {
}


class Father{
    private int gold = 10;
    int car = 1;
    public int bhk3 = 1;
}

class Son extends Father{
    void weCanUse(){
//      System.out.println(gold);
        System.out.println(car);
        System.out.println(bhk3);
    }
}