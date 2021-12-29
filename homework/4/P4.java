import java.util.Scanner;
public class P4 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        int n = vvod.nextInt();
        //boolean isProst = true;
        int countProst = 0;


        for (int i = 2; i <= 100000; i++) {
            boolean isProst = true;
            for (int j = 2; j < i; j++) {
                //System.out.println("i = "+ i);
                //System.out.println("j = "+ j);
                if (i % j == 0) {
                    isProst = false;
                }
            }
            if (isProst && n >0) {
                System.out.print(i + " ");
                countProst++;
            }
            if (countProst == n)
                break;

        }
        System.out.println("");
        //System.out.println(countProst);
    }
}
