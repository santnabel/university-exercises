/*
 Let the next opperation be appliable to any positive integer:
 If the number is even, it is divided by 2.
 If it's odd, it will be multiplied by 3 and 1 is added.
 The positive integer number must be asked to the user.
 Print each element of the Collatz conjecture until it reaches 1.
*/
import java.util.Scanner;
public class Collatz_Conjecture {
    public static void main (String[] args) {
        int number, remainder = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        number = input.nextInt();
        if (number > 0) {
            for (; number > 1;) {
                System.out.print("\t" + number);
                remainder = number % 2;
                if (number == 0) {
                    number = number / 2;
                } else {
                    number = (number * 3) + 1;
                }
            }
            System.out.println("\t" + number); // > To print 1.
        } else {
            System.out.println("ERROR!!!111!!11!!1");
        }
        input.close();
    }
}
