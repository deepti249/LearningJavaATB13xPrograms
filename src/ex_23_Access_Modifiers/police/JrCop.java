package ex_23_Access_Modifiers.police;

public class JrCop {
    public static void main(String[] args) {
        Cop jrCop = new Cop(5);
        jrCop.canIShoot();
        jrCop.thisDefaultF1();
    }
}
