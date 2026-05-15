/*
 Program to convert Celsius to Fahrenheit. Consider that F = C * 9.0 / 5.0 + 32. The Celsius temperature must be greater than -32, otherwise print
 an error message. Consider all necessary validations.
*/
import java.util.Scanner;
public class Degrees_Celsius {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value in degrees Celsius: ");
        double degreesCelsius = input.nextDouble();
        if (degreesCelsius > -32) {
            double degreesFahrenheit = degreesCelsius * 9.0 / 5.0 + 32;
            System.out.println("\nValue in degrees Fahrenheit: " + degreesFahrenheit);
        } else {
            System.out.println("\nError.");
        }
        input.close();
    }
}
