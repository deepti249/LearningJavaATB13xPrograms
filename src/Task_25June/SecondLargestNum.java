package Task_25June;

public class SecondLargestNum {
    public static void main(String[] args) {
        // Find Second-Largest Number in an Array
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};

//        Using sort method to find the second-largest number is the array
//        Arrays.sort(numbers);
//        System.out.println("Second Largest Number: " + numbers[numbers.length-2]);

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            }
        }
        System.out.println("Largest: " + largest);
        System.out.println("SecondLargest: " + secondLargest);
    }
}