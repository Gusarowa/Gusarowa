import java.util.*;

public class P13 {
    public static int get(int[] a, int i) {
        if (i >= a.length) {
            return 0;
        } else {
            return a[i];
        }
    }

    public static int[] add1(int q, int[] a, int[] b) {
        int n = a.length;
        if (n < b.length) {
            n = b.length;
        }
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = get(a, i) + get(b, i);
        }
        return c;
    }

    public static int[] add(int q, int[] a, int[] b) {
        int[] c = add1(q, a, b);
        c = P11.carry(q, c);
        return c;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(add(10, new int[]{9, 9, 9}, new int[]{1})));
    }
}