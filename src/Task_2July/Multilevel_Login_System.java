package Task_2July;
/*
Create a class User with a method login().
Extend it with a class AdminUser that adds a method accessAdminPanel().
Then create a SuperAdmin class that extends AdminUser and adds a method shutdownSystem().

Use an object of SuperAdmin to call all three methods.
 */

public class Multilevel_Login_System {
    public static void main(String[] args) {
        SuperAdmin s = new SuperAdmin();
        s.login();
        s.accessAdminPanel();
        s.shutdownSystem();
    }
}

class User{
    void login(){
        System.out.println("1 - User Login");
    }
}

class AdminUser extends User{
    void accessAdminPanel(){
        System.out.println("2 - Admin User");
    }
}

class SuperAdmin extends AdminUser{
    void shutdownSystem(){
        System.out.println("3 - Super Admin");
    }
}