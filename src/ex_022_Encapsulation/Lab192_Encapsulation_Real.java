package ex_022_Encapsulation;

//- Encapsulation is a fundamental concept in object-oriented programming (OOP).
//- Encapsulation ->Bundling of data and methods that operate on that data within a single unit called Class
//- Data members should be private in nature.
//- Methods with getter and setter only, you can access the data members / attributes.

public class Lab192_Encapsulation_Real {

    public static void main(String[] args) {
         ICICIBank bank = new ICICIBank("Deepti", 500);
       // System.out.println(name);
        String name = bank.getName();
        System.out.println(name);

        long bal = bank.getBal();
        System.out.println(bal);

        System.out.println("--------------------");

        bank.setBal(1000, false);
        long bal1 = bank.getBal();
        System.out.println(bal1);

        System.out.println("--------------------");
        bank.setBal(5000, true);
        long bal2 = bank.getBal();
        System.out.println(bal2);

    }
}

class ICICIBank{


    private String name;
   private long bal;

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal,boolean isCashier) {
        if(isCashier) {
            this.bal = bal;
        }else {
            System.out.println("Not allowed to change the balance!");
        }
    }



}