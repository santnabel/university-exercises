/*
 Make an application that estimates the value of a mathematical constant e, using the formula:
 e = 1 + 1/1! + 1/2! + 1/3! + 1/4! + 1/5! +... 
 Ask the user for the number of iterations.
 Print out the result of the sum.
*/
import java.util.Scanner;
public class Mathematical_Constant {
    public static void main (String[] args) {
        double e = 1, sum = 0, factorial = 1;
        int iterations;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of iterations: ");
        iterations = input.nextInt();
        System.out.printf("%.0f", e);
        for (double i = 0; i <= iterations; i++) {
            System.out.printf(" + %.0f/%.0f!", e, i);
            if (i > 0) { // > Here we make the operation for the factorial.
                factorial *= i;
            }
            sum += 1.0 / factorial;
        }
        System.out.printf("\nSumatoria: %f", sum);
        input.close();
    }
}
