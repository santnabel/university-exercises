public class Print_Numbers {
    public static void main(String[] args) {
        String option = "Y";
        while (option.equalsIgnoreCase("Y")) {
            int number = 1;
            int limit = Integer.parseInt(System.console().readLine("\nEstablish limit: "));
            if (limit > 0) {
                while (number <= limit) {
                    for (int i = 0; i < number; i++) {
                        System.out.print(number);
                    }
                    System.out.println("");
                    number++;
                }
                option = System.console().readLine("\nAgain? Y/N: ");
            } else {
                System.out.println("ERROR. Only positive integers are allowed.");
            }
        }
        System.out.println("Thank you for using the program :)");
    }
}
