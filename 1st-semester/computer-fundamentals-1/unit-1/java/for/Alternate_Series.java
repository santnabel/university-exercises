/*
 Find the alternate series for 1/50Encuentre la serie alternada para 1/50
 Alternate serise = 1 - 1/2 + 1/3 - 1/4 + 1/5 - 1/6 + 1/7 - 1/8 +...
 Print the result of the sum.
*/
public class Alternate_Series {
    public static void main (String[] args) {
        double j = 1, b = 1, sum = 0;
        System.out.printf("%.0f", j);
        sum += j/b;
        for (double i = b; i < 50; ) {
            i++;
            j = -j;
            System.out.printf(" %.0f/%.0f ", j, i);
            sum += j/i;
        }
        System.out.printf("\nSum: %f", sum);
    }
}
