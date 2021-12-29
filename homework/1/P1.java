import java.io.*;

import java.util.Random;
import java.util.Scanner;


public class P1 {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        // diapason {2, 1023}
        int num = sc.nextInt();  // Загадываемое число
        trying_to_guess(num);
    }

    public static void trying_to_guess(int num) {
        int low = 1;
        int high = 1024;

        int guess = rand.nextInt(1024);

        while (guess != num) {
            System.out.print("? " + guess + " ");

            // 0 -- меньше
            // 1 -- больше
            int answer = sc.nextInt();  //  0/1
            System.out.println();

            if (answer == 0) {
                high = guess;
            } else if (answer == 1) {
                low = guess + 1;
            }

            guess = (low + high) / 2;
        }
        System.out.println("Число угадано - " + guess);

    }
}

