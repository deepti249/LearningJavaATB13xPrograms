package ex_19_OOPS_Constructor;

public class Lab174_DC {
    public static void main(String[] args) {
        Student s1 = new Student(); //Object is created so it will automatically call default constructor

        Student s2; //This doesn't create object, so default constructor will not be called

        new Student();//Here, Object is created again so it will also automatically call default constructor
    }
}

class Student{
    String name;

    // is called as the default constructor, same name as the class name.
    Student(){
        System.out.println("DC");
    }

    void study(){
        System.out.println("Student has to study");
    }

}
