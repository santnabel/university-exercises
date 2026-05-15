/*
 Design a program that asks for the age of a person. If it is between 0 and 12, print kid, if it is between 13 and 17, print teen, if it is between 18 and 25, print young adult, if it is
 between 26 and 45 print adult, if it is between 40 and 60, print older adult, if it is between 61 and 120, print elder, if it is greater than 120, print hard to believe. Consider all the
 necessary validations.
*/
import java.util.Scanner;
public class Print_Age {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the age of a person: ");
        int age = input.nextInt();
        if (age == 0 || age <= 12) {
            System.err.println("Kid.");
        } else if (age == 13 || age <= 17) {
            System.out.println("Teen.");
        } else if (age == 18 || age <= 25 ) {
            System.out.println("Young adult.");
        } else if (age == 26 || age <= 45) {
            System.out.println("Adult.");
        } else if (age == 46 || age <= 60) {
            System.out.println("Older adult.");
        } else if (age == 61 || age <= 120) {
            System.out.println("Elder.");
        } else {
            System.out.println("Hard to believe.");
        }
        input.close();
    }
}
