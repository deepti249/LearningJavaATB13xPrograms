package ex_19_OOPS_Constructor;

public class Lab175_Default_Constructor {
    public static void main(String[] args) {
        Baby b = new Baby();
        //As soon as new Object is created, it will automatically call default constructor once.
      //  b.name = "Nivisha";
        System.out.println(b.name);

    }
}

class Baby{
    // Attribute | Instance Variable |  Member variables, data members
    String name;

    // Default Constructor!
    Baby(){
        System.out.println("I am called, Default Constructor!");
        System.out.println("Your Aadhar Number is ready!");
        name = "Gugu";

        // Fetch data from the MySQL database...
        // Read from CSV File , XLSX
        // Open a file and read the data. (json, testdata.xlsx, txt file)
    }


    // Behaviour
    void cry(){
        System.out.println("Cry!!");
    }

    void sleep(){
        System.out.println("Sleep!!");
    }

    void eat(){
        System.out.println("Eat!!");
    }


}