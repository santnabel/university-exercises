/*
 Find the geometric series for 1/50
 Geometric series = 1/1 + 1/2 + 1/4 + 1/6 + 1/8 + 1/10 + 1/12 +...
 Print the result of the sum
 Sum = 2.90797909
*/
public class Geometric_Series {
    public static void main (String[] args) {
        double j = 1, b = 1, sum = 0;
        System.out.printf("%.0f/%.0f ", j, b);
        sum += j/b;
        for (double i = b; i < 51; i++) {
            i++;
            System.out.printf("%.0f/%.0f ", j, i);
            sum += j/i;
        }
        System.out.printf("\nSumatoria: %f", sum);
    }
}
