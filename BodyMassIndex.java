import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double height = input.nextDouble();
        double weight = input.nextDouble();

        if (height <= 0 || weight <= 0) {
            System.out.println("Invalid input");
        } 
        else {
            double bmi = weight / (height * height);

            // FIX: Print height as read, and fix weight formatting to %.2f
            System.out.println("Height: " + height + " m");
            System.out.printf("Weight: %.2f kg%n", weight); 
            System.out.printf("BMI: %.2f%n", bmi);

            String result;
            if (bmi < 18.5) {
                result = "Underweight";
            } else if (bmi < 25.0) {
                result = "Normal";
            } else if (bmi < 30.0) {
                result = "Overweight";
            } else {
                result = "Obese";
            }

            System.out.println("Result: " + result);
        }

        input.close();
    }
}
