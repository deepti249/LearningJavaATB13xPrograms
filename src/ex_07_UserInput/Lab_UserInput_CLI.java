package ex_07_UserInput;

public class Lab_UserInput_CLI {
    public static void main(String[] args) {

       /* int age = 65;
        String canIVote = age > 18 ? "Yes" : "No";
        System.out.println(canIVote);*/

    //If we want to take input from user then we use CLI option


        String age_string = args[0];  //first argument
        System.out.println(age_string);
        int age = Integer.parseInt(age_string);
        String canIVote = age >= 18 ? "Yes" : "No";
        System.out.println(canIVote);
    }
}
