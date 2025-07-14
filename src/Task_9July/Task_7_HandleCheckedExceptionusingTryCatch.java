package Task_9July;
/*
✅ Task 7: Handle Checked Exception using Try-Catch
📘 Description:
Open a file using FileReader and handle FileNotFoundException using try-catch.
 */

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task_7_HandleCheckedExceptionusingTryCatch {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("nonexistentfile.txt");
            System.out.println("File opened successfully.");
        } catch (FileNotFoundException e)
        {
            System.out.println("FileNotFoundException: The specified file was not found.");
        }

        System.out.println("Program continues after handling checked exception.");
    }
}
