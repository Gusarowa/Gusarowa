import java.util.*;

public class P14 {
    public static int get(int[] a, int i) {
        if (i >= a.length) {
            return 0;
        }
        return a[i];
    }

    public static int compare(int q, int[] a, int[] b) {
        int n = Math.max(a.length, b.length);
        while (n >= 0) {
            if (get(a, n) > get(b, n)) {
                return 1;
            } else if (get(a, n) < get(b, n)) {
                return -1;
            } else {
                n--;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int a = compare(10, new int[]{1, 2, 3}, new int[]{3, 1, 1});
        System.out.println(a);
    }
}
