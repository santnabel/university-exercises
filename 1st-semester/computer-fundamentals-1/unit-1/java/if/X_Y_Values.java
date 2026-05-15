/*
Make an algorithm that prints the values of X and Y, having the value of X as input and calculating the value of Y according to the following conditions: If X > 0 then Y = 3X + 6.
If X=0 then Y = X + 6 
If X<0 then Y = X

Consider all necessary validations.
 */
import java.util.Scanner;
public class X_Y_Value {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.println("Enter a value for X: ");
        x = input.nextInt();
        if (x > 0) {
            System.out.printf("Y = 3(%d) + 6", x);
        } else if (x == 0) {
            System.out.printf("Y = %d + 6", x);
        } else if (x < 0) {
            System.out.printf("Y = %d", x);
        }
    }
}
