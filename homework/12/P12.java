
import java.util.Arrays;

public class P12 {
    public static int[] multiplyDigit(int q, int[] a, int k) {
        a = P11.carry(q, a);
        int[] s = new int[a.length];
        int c = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            s[i] += (a[i] * k + c) % q;
            c = (a[i] * k + c) / q;
        }
        return s;
    }

    public static void main(String[] args) {
        int[] s = multiplyDigit(100, new int[]{1, 2}, 0);
        System.out.println(Arrays.toString(s));
    }
}