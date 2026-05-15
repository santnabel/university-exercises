/*
 Find the Farey succesion for a number, for example:
 3 = 1/1, 1/2, 1/3
     2/1, 2/2, 2/3
     3/1, 3/2, 3/3
*/

import java.util.Scanner;
public class Farey_Succession {
    public static void main (String[] args) {
        int successionNumber;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for the Farey succession: ");
        successionNumber = input.nextInt();
        for (int i = 1; i <= successionNumber; i++) {
            for (int j = 1; j <= successionNumber; j++) {
                System.out.printf("%d/%d\t", i, j);
            }
            System.out.println("");
        }
        input.close();
    }
}
