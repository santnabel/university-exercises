/*
 Sum of 1/1 + 1/2 + 1/3 + 1/4 + ... + 1/50
 Calculate the result
*/
public class Fractions_Sum {
    public static void main (String[] args) {
        double n = 1, i = 1, result = 0;
        System.out.println("\n|| FRACTIONS SUM ||\n");
        System.out.printf("%.0f", i / n);
        for (n = 1; n < 50; ) {
            n++;
            System.out.printf(", %.3f", i / n);
            result += i / n;
        }
        System.out.printf("\nSum result: %.3f", result);
    }
}
