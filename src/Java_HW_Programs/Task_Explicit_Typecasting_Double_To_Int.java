package Java_HW_Programs;

public class Task_Explicit_Typecasting_Double_To_Int {
    public static void main(String[] args) {
        //Casts a double to an int, cutting off decimals value.
        double doubleValue = 123.456;
        int intValue = (int) doubleValue;
        System.out.println("Original double value: " + doubleValue);
        System.out.println("Casted int value: " + intValue);
    }
}
