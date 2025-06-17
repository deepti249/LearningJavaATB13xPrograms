package ex_10_Switch_Case;

public class Lab092_Interview_Ex2 {
    public static void main(String[] args) {
        char ch = 'A';
        switch (ch){

            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("No Match");

//Char is allowed as case in Switch as it gets converted to Int (ASCII value)
        }
    }
}
