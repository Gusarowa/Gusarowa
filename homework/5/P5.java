import java.util.Scanner;
public class P5{
    public static void main(String[] args){
        Scanner vvod = new Scanner(System.in);
        int n = vvod.nextInt();
        int max1 = -111;
        int max2 = 0;
        int sum =0;
        int sum_final = 0;
        int x = 0;
        boolean f = true;
        while (n!=0){
            if (n > max1){
                max1 = n;
                sum = 0;
                sum_final = 0;

                f = true;
            } else if (n == max1 && f) {
                max2 = max1;
                sum_final = sum ;
                //System.out.println("sum_final =" + sum_final );
                x++;
                f = false;
            } else {
                sum +=n;
            }
            //sum +=n;
            //System.out.println("sum = "+ sum);
            n = vvod.nextInt();
        }
        if (x<1){
            System.out.println("NO");
        } else {
            System.out.println(sum_final);
        }
    }
}