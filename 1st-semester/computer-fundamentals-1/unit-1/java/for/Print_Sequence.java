/*
 Print the following on the screen:
 Enter the number for the sequence: 5
 1
 22
 333
 4444
 55555

 Enter the number for the sequence: -4
 -4-4-4-4
 -3-3-3
 -2-2
 -1
*/
import java.util.Scanner;
public class Print_Sequence {
    public static void main (String[] args) {
        int seq;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number for the sequence: ");
        seq = input.nextInt();
        if (seq > 0) {
            for (int i = 0; i < seq; ) {
                i++;
                for (int j = 0; j < i; j++) {
                    System.out.print(" " + i);
                }
                System.out.println("");
            }
        } else {
            for (int i = seq; i <= -1; i++) { // > The loop is going to start from -5 (or whatever value we give to "seq") to -1.
                for (int j = i; j < 0; j++) { // > The "j" variable initiliazes with a value of "i", therefore the number of times that is going to print out "i" depends of what's the value of that variable. Then it will start to increment until it reaches 0.
                    System.out.print("" + i);
                }
                System.out.println("");
            }
        }
        input.close();
    }
}
