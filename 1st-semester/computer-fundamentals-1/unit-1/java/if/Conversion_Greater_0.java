/*
 Program to convert feets to centimeters. If the centimeters are greater than zero, print the result, otherwise print an error message. Consider all the
 necessary validations.
*/
import java.util.Scanner;
public class Conversion_Greater_0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value in feets: ");
        double feetsValue = input.nextDouble();
        double centimetersValue = valorPies * 100;
        if (centimetersValue > 0) {
            System.err.println("\Result: " + centimetersValue);
        } else {
            System.out.println("Error.");
        }
        input.close();
    }
}
