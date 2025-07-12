package Task_4July;

/* Program 5: default (no modifier) access - same package only
📝 Instructions:
Create a class Student with a method showDetails() without any access modifier (default).
In the same file or same package, create a class TestDefault.
In main(), create an object of Student and call the showDetails() method.
 */

public class Program_5_DefaultAccessModifier {
        public static void main(String[] args) {
            Student s = new Student();
            s.showDetails();

            System.out.println("-------------------------");

            TestDefault td = new TestDefault();
            td.showDetails();
        }
    }

    class Student {
        void showDetails() {
            System.out.println("Student details");
        }
    }

    class TestDefault extends Student {
        @Override
        void showDetails() {
            super.showDetails();
            System.out.println("Test details");
        }
    }
