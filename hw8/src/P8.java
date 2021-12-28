import java.util.*;

public class P8 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int n = vvod.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            int k = n - i - 1;
            //System.out.println("k = " + k + " " + "i =" + i);
            a[k] = i + 1;
            //System.out.println("a[k] = " + a[k]);
            int i_2 = i;
            if (k % 2 == 0) {
                //System.out.println("k = " + k);
                i = k / 2;
                b[k] = i + 1;
                i = i_2;
                //System.out.println("i = " +i);
            } else {
                i = (i + k) - k / 2;
                b[k] = i + 1;
                //System.out.println("a[b] = " + a[b]);
                i = i_2;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}