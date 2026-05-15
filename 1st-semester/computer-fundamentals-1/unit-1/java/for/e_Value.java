/*
 Using the following formula (Brook Taylor), make a program that calculates the value of e^x
 e^x = 1 + x^1/1! + x^2/2! + x^3/3! + ... + n^n/n!
 Ask the user for the number of iterations.
*/
import java.lang.Math;
import java.util.Scanner;
public class e_Value {
    public static void main (String[] args) {
        int iterations;
        double x = 1, n = 0, sum = 0;
        long factorial = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of iterations: ");
        iterations = input.nextInt();
        System.out.printf("\nex = %.0f ", x);
        sum += x;
        x = iterations;
        for (double i = 1; i < x; i++) {
            n++;
            System.out.printf("+ %.0f^%.0f/%.0f! ", x, n, i);
            if (i > 0) {
                factorial *= i;
            }
            sum += Math.pow(x, n) / factorial;
        }
        System.out.printf("\Sum: %f", sum);
    }
}
