package ex_19_OOPS_Constructor;

public class Lab179_PC_Real {
    public static void main(String[] args) {
        Person p1 = new Person("AMIT",97654321,"abc");
        System.out.println(p1.name);
        System.out.println(p1.phone);
        System.out.println(p1.address);
        p1.eat();

        Person p2 = new Person("PRAMOD");
        System.out.println(p2.name);
        p2.eat();

        Person p3  = new Person();
        p3.name = "Shikha";
        System.out.println(p3.name);
        p3.eat();

        Person p4 = new Person("LUCKY",823424242);
        System.out.println(p4.name);
        System.out.println(p4.phone);
        System.out.println(p4.address); //null
        p4.eat();

    }
}

class Person {

    String name;
    long phone;
    String address;

    Person(){

    }
    Person(String name_user){
        this.name = name_user;
    }

    Person(String name_user,long phone_user,String address_user){
        this.name = name_user;
        this.phone = phone_user;
        this.address = address_user;
    }

    Person(String name_user,long phone_user){
        this.name = name_user;
        this.phone = phone_user;

    }
//This is Constructor Overloading -> Different type of parametrized constructors are
// created by changing the number of arguments or parameters

    void eat(){
        System.out.println(this.name + " is eating!");
    }

}