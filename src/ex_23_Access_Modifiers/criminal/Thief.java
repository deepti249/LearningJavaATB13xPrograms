package ex_23_Access_Modifiers.criminal;

import ex_23_Access_Modifiers.police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop thief = new Cop(100);
        thief.gun = 100;

       //  thief.canIShoot();
      //  thief.thisDefaultF1();
    }
}
