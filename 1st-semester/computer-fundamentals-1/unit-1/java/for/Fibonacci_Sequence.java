/*
 Make a program to find the Fibonacci sequence. Sequence is the following:
 F = 0,1,1,2,3,5,8,13,21,34,55,.........,n
 The first element is 0, second is 1 and each remaining element is the sum of the previous two. The program must ask for the limit number of the series.
 */
import java.util.Scanner;
public class Fibonacci_Sequence {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0, j = 1, sum, limit;
        System.out.println("Establish a limit: ");
        limit = input.nextInt();
        System.out.printf("%d", i);
        System.out.printf(", %d", j);
        for (sum = 1; sum < limit; ) {
            System.out.printf(", %d", sum);
            suma = i + j;
            i = j; // > "i" takes the previous value of "j".
            j = sum; // > "j" takes the value of the new number (sum).
        }
        input.close();
    }
}
