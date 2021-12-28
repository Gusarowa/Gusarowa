import java.util.*;

public class P11 {
    public static int[] extend(int[] a, int n) {
        int[] b = new int[n];
        for (int i = 0; i < Math.min(a.length, n); i++) {
            b[i] = a[i];
        }
        return b;
    }

    public static int[] carry(int q, int[] a) {
        int c = 0;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            a[i] += c;
            c = a[i] / q;
            a[i] %= q; // a[i] = a[i] % q
            if (a[i] < 0) {
                a[i] += q;
                c = -1;
            }
        }
        if (c > 0) {
            a = extend(a, n + 1);
            a[n] = c;
            n++;
        }
        while (n > 0 && a[n - 1] == 0) {
            n--;
        }
        a = extend(a, n);
        return a;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(carry(10, new int[]{42})));
    }
}