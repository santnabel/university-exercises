/*
 The Padovan succession is the sequence of numbers P(n) defined by the following initial values:
 P(0) = P(1) = P(2) = 1, and the next recurrency relation.
 P(n) = P(n-2) + P(n-3).
 The first values of P(n) are
 1, 1, 1, 2, 2, 3, 4, 5, 7, 9, 12, 16, 21, 28, 37, 49, 65, 86, 114, 151, 200, 265, 351, 465, 616, 816, 1081, 1432, 1897, 2513, 3329, 44100,...
 Ask the user for the limit of the series.
*/
import java.util.Scanner;
public class Padovan_Succession {
    public static void main (String[] args) {
        int p0 = 1, p1 = 1, p2 = 1, nextP, limit;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for the limit of the sequence: ");
        limit = input.nextInt();
        // > We print the initial values.
        System.out.printf("%d, %d, %d", p0, p1, p2);
        for (int i = 3; i < limit; i++) {
            // > We make the formula.
            nextP = p0 + p1;
            // > We break the cycle with this condition.
            if (nextP > limit) {
                break;
            }
            System.out.printf(", %d", nextP);
            // > We update the values.
            p0 = p1;
            p1 = p2;
            p2 = nextP;
        }
        input.close();
    }
}
