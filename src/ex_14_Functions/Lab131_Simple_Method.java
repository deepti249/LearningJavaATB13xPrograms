package ex_14_Functions;

public class Lab131_Simple_Method {
    public static void main(String[] args) {
        noreturn_f1();
        return_int();
        return_boolean();
        return_long();
        return_String();
        return_float_pi_value();
    }

    static void noreturn_f1(){
        System.out.println("No Return");
    }

    static int return_int() {
        System.out.println("This is a normal function which return int.");
        return 10;
    }
        static boolean return_boolean(){
            return true;
        }
        static float return_float_pi_value(){
            return 3.14f;
        }

        static long return_long(){
            return 10l;
        }

        static String return_String(){
            return "Pramod";
        }

}
