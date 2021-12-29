import java.util.*;

public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, s;
        x = sc.nextDouble();
        s = x;
        double n = 1;
        double g = 1;
        do {
            g = g * (2 * n) * (2 * n + 1);
            s += Math.pow(-1.0, n) * (Math.pow(x, (2 * n + 1)) / g);
            n += 1;
        } while (n < 100);
        System.out.println(s);

    }
}