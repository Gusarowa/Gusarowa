import java.util.Scanner;
public class P6{
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int n = vvod.nextInt();
        int max = 0;
        int min = n;
        int sum = 0;
        int sum_final = 0;
        int count = 0;
        int first_maxx = 0;
        int  max1 = 0;
        while (n !=0) {
            if (n <= min) {
                min = n;
                //System.out.println("min = " + min);
                sum_final = sum;
                //System.out.println("sum_final = " + sum_final);

            }
            sum += n;
            count++;
            //System.out.println("sum = " + sum);
            if (n > max) {
                max = n;
                //System.out.println("max = " + max);
                sum = 0;
                first_maxx++;
            }
            n = vvod.nextInt();
        }
        if (sum_final > 0 && first_maxx > 0 && count> 0){
            System.out.println(sum_final + max + min);
        } else if (count == 0){
            System.out.println("NO");
        } else {
            System.out.println(0);
        }
    }
}