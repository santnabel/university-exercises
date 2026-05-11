/*
 Arithmetic Series: Each term is obtained by adding a constant to its
 previous. For example, starting with 1 and adding 2:
 1, 3, 5, 7, 9,...
 The program must request: Start, constant and end.
*/
import java.util.Scanner;

public class Arithmetic_Series {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int constant, end, start, option = 'Y';
        do {
            System.out.println("Enter a number for the start: ");
            start = input.nextInt();
            System.out.println("Enter a number for the constant: ");
            constant = input.nextInt();
            System.out.println("Enter a number for the end: ");
            end = input.nextInt();
            do {
                if (start < end) {
                    System.out.printf("%d + ", start);
              } else {
                    System.out.printf("%d\n", start);
              }
              start += constant;
            } while (start <= end);
            option = Integer.parseInt(System.console().readLine("Again? Y/N"));
        } while (option == 'Y');
        input.close();
    }
}
