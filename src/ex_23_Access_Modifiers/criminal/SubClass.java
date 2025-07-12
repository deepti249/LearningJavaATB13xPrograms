package ex_23_Access_Modifiers.criminal;

import ex_23_Access_Modifiers.police.Cop;

public class SubClass extends Cop {

    public static void main(String[] args) {

        SubClass sc = new SubClass(100);
      //  sc.thisDefaultF1();
        sc.canIShoot();
    }

    public SubClass(int bullet) {
        super(bullet);
    }
}
