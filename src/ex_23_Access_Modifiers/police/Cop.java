package ex_23_Access_Modifiers.police;

public class Cop {
    public int gun;
    private String iCard;

    //PC
    public Cop(int bullet){
        this.gun = bullet;
    }

    //Protected Method
    protected void canIShoot(){
        System.out.println("Yes you can Shoot!");
    }

    //Default Method
    void thisDefaultF1(){
        System.out.println("Hi, Cop!");
    }
}
