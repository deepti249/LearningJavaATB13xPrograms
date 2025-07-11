package ex_022_Encapsulation;

public class Lab191_Encapsulation {
    public static void main(String[] args) {
        VWOLogin vwoLogin = new VWOLogin("admin", "pass123");
        System.out.println(vwoLogin.password);
        System.out.println("----------------------");

        vwoLogin.password = "345";
        System.out.println(vwoLogin.password);
        System.out.println("----------------------");

        /*User is able to change sensitive data like password by using object reference.
        So,to hide sensitive data and also to not allow user to change sensitive data,
        we need to declare variables private and call them only through methods using getter and setter.*/

        GoodVWOLogin vwoLogin1 = new GoodVWOLogin("admin", "pwd123");
//        System.out.println(vwoLogin1.password);

        String user = vwoLogin1.getUsername();
        System.out.println(user);
        String pass = vwoLogin1.getPassword();
        System.out.println(pass);
        System.out.println("----------------------");

        vwoLogin1.setPassword("pass1234",true);
        String pass1 = vwoLogin1.getPassword();
        System.out.println(pass1);



    }
}

class VWOLogin{
    public String username;
    public String password;

    public VWOLogin(String username,String password) {
        this.password = password;
        this.username = username;
    }
}

class GoodVWOLogin{
    // Instance Variable | Data variable | Attribute | Fields |  properties | member variables
    private String username;
    private String password;

    // PC
    public GoodVWOLogin(String usr, String pwd) {
        this.username = usr;
        this.password = pwd;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password,boolean isAdmin) {
        if(isAdmin) {
            this.password = password;
        }else {
            System.out.println("Can't change the password!");
        }
    }
}