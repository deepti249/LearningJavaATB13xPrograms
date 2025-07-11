package ex_019_OOPS_Constructor;

public class Lab178_PC {
    public static void main(String[] args) {
        BabyA b1 = new BabyA();
        System.out.println(b1.name); //DC

        BabyA b2 = new BabyA();
        System.out.println(b2.name); //DC

        BabyA b3  = new BabyA("lucky","23454323",2025,07,01);
        System.out.println(b3.name); //PC

        BabyA b4  = new BabyA("amit","13454323",2024,07,01);
        System.out.println(b4.name); //PC

    }
}


class BabyA{

    String name;
    String aadhar_number;
    int year;
    int month;
    int day;

    // DC
    BabyA(){
        name = "Gugu";
        aadhar_number = "0000";
        year = 1971;
        month = 01;
        day = 01;

    }

    BabyA(String name_user,String aadhar_number_user,int year_user, int month_user,int day_user){
        this.name = name_user;
        this.aadhar_number = aadhar_number_user;
        this.year = year_user;
        this.month = month_user;
        this.day = day_user;
    }



}