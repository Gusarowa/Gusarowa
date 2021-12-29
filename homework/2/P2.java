import java.util.Scanner;
public class P2 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Загадай любое целое число от 0 до 1023");//допустим загадали 63
        int a = 0, b = 1023;//начало,конец
        int num = vvod.nextInt();
        int x = vvod.nextInt();// к примеру 50

        while (x !=num)
        {
            x = (a+b)/2;
            System.out.println("Комп спрашивает: " + "? " + x);
            int otvet = vvod.nextInt();//Ответ: больше или меньше
            if (otvet == 0)//что означает загаданное число больше (x < num). наше число находится [x;b]
            {
                a = x;
            }
            else if (otvet == 1)//что означает загаданное число меньше (x > num). наше число находится [a;x]
            {
                b = x;
            }
        }
        System.out.println("! " +x);
    }
}
