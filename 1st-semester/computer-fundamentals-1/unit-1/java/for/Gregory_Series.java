/*
 Calculate the value of pi using the following infinite series (Gregory-Leibniz series):
 pi = 4/1 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 +....
 For 20 iterations and print out the result.
*/
public class Gregory_Series {
    public static void main (String[] args) {
        double j = 4, b = 1, pi = 0;
        for (int i = 0; i < 20; i++) {
            pi += j/b;
            System.out.printf("%.0f/%.0f ", j, b);
            b++; b++;
            j = -j;
        }
        System.out.printf("\nPI value is: %f", pi);
    } 
}
