package Task_3July;
/*
Task 3: Employee Role Info
Title: Show employee roles with overridden methods
Description:
Create a class Employee with method role() printing “General Employee”.
Create child classes Manager, Clerk, Tester, each overriding role() to print their specific roles.
Call role() on each object to show how overriding helps in specialization.
 */

public class Method_Overriding_Employee_Role_Info {
    public static void main(String[] args)
    {
        Employee employee = new Employee();
        employee.role();

        Manager manager =new Manager();
        manager.role();

        Clerk clerk = new Clerk();
        clerk.role();

        Tester tester = new Tester();
        tester.role();

    }
}

class Employee {
    void role() {
        System.out.println("General Employee");
    }
}

class Manager extends Employee {
    @Override
    void role() {
        System.out.println("Manager");
    }
}

class Clerk extends Employee {
    @Override
    void role() {
        System.out.println("Clerk");
    }
}

class Tester extends Employee {
    @Override
    void role() {
        System.out.println("Tester");
    }
}