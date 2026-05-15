/*
 Program to determine if a number is negative even, positive even, zero, or neither. Consider all necessary validations.
 */
import java.util.Scanner;
public class Negative_Even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, remainder;
        System.out.println("Enter a number: ");
        number = input.nextInt();
        remainder = number % 2; // > The '%' is the modulo operator. It returns the remainder of the division between 2.
        System.out.println("Remainder: " + remainder);
        if (remainder == 0 && number < 0) {
            System.out.println("Negative even.");
        } else if (remainder == 0 && number > 0) {
            System.out.println("Positive even.");
        } else if (number == 0) {
            System.out.println("Zero.");
        } else {
            System.out.println("Neither of the conditions.");
        }
        input.close();
    }
}
