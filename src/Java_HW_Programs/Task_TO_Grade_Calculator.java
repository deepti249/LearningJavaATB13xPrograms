package Java_HW_Programs;

public class Task_TO_Grade_Calculator {
    //Marks 90 = A+, 75 = A, 60 = B, 40 = C, below 40 Fail.
    public static void main(String[] args) {
        int marks = 35; // Example marks

        // Rough logic                                  Code Logic
        // marks = 90+ --> A+                                 marks >= 90
        // marks = 75 to 89 --> A                       75 <= marks < 90
        // marks = 60 to 74--> B                        60 <= marks < 75
        // marks = 40 to 59--> C                        40 <= marks < 60
        // marks < 40 --> Fail                                marks < 90


        String grade = (marks >= 90) ? "A+" :
                (marks >= 75 && marks < 90) ? "A" :
                        (marks >= 60 && marks < 75) ? "B" :
                                (marks >= 40 && marks < 60) ? "C" : "Fail";

        //Another logic
       /* String grade = marks >= 90 ? "A+" :
                marks >= 75 ? "A"  :
                        marks >= 60 ? "B"  :
                                marks >= 40 ? "C"  : "Fail";*/

        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}
