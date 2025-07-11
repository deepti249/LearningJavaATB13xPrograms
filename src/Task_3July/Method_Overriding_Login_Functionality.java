package Task_3July;
/*
 Task 4: Login Functionality
Title: Different login behaviors for users
Description:
Create a class User with method login() that prints “User login”.
Create subclasses AdminUser and RegularUser, each overriding login() with their own logic/messages.
Demonstrate calling the login() method using base class reference to highlight runtime polymorphism.
 */

public class Method_Overriding_Login_Functionality {
    public static void main(String[] args) {

        User user = new User();
        user.login();

        AdminUser adminUser = new AdminUser();
        adminUser.login();

        RegularUser regularUser = new RegularUser();
        regularUser.login();
    }
}

class User
{
    void login() {
        System.out.println("User login");
    }
}

class AdminUser extends User {
    @Override
    void login() {
        System.out.println("Admin login");
    }
}

class RegularUser extends User {
    @Override
    void login() {
        System.out.println("Regular user login");
    }
}