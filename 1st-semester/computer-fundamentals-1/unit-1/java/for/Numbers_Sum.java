/*
 Find the sum of a series of numbers, the user must be asked the limit. (You can use the Gauss's formula)
 
 Enter the number for the sum: 8
 Sum = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8
 Result = 36

 Enter the number for the sum: 100
 Sum = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + ... + 100
*/
import java.util.Scanner;
public class Numbers_Sum {
    public static void main (String[] args) {
        int sum = 0, limit, result = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for the number of sums: ");
        limit = input.nextInt();
        for (int i = 0; i < limit; i++) {
            System.out.printf("%d ", i + 1);
            // > We use Gauss's formula.
            result = (limit * (limit + 1)) / 2;
        }
        System.out.println("\nSum result: " + result);
        input.close();
    }
}
