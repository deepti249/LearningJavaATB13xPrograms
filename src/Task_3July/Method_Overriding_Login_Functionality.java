package Task_3July;

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
    void login()
    {
        System.out.println("User login");
    }
}

class AdminUser extends User
{
    @Override
    void login()
    {
        System.out.println("Admin login");
    }
}

class RegularUser extends User
{
    @Override
    void login()
    {
        System.out.println("Regular login");
    }
}