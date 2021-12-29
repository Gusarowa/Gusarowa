import java.util.*;
public class P9 {
    public static void main(String[] args){
        Scanner vvod = new Scanner(System.in);
        int n = vvod.nextInt();
        int m =vvod.nextInt();
        int[][] a = new int [n][m];
        int s = 1; //счетчик, который заполняет значение массива

        //двигаемся влево
        for (int j = 0;j < m; j++){
            a[0][j] = s;
            s++;
        }

        //двигаемся вниз
        for (int i = 1; i< n; i++){
            a[i][m-1] = s;
            s++;
        }

        //двигаемся вправо
        for (int j = m-2; j>=0; j-- ){
            a[n-1][j] = s;
            s++;
        }

        //двигаемся вверх
        for (int i =n-2;i>0;i--){
            a[i][0] = s;
            s++;
        }
// заполнили внешний прямоугольник


        int x = 1;//координаты ячейки a[x][y]
        int y = 1;//координаты ячейки a[x][y]

        while (s < n*m) {

            //двигаемся вправо
            while (a[x][y + 1] == 0) {
                a[x][y] = s;
                s++;
                y++;
            }

            //двигаемся вниз
            while (a[x + 1][y] == 0) {
                a[x][y] = s;
                s++;
                x++;
            }

            //двигаемся влево
            while (a[x][y-1] == 0) {
                a[x][y] = s;
                s++;
                y--;
            }

            //двигаемся вверх
            while (a[x - 1][y] == 0) {
                a[x][y] = s;
                s++;
                x--;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == 0) {
                    a[i][j] = s;
                }
            }
        }

        for (int i =0;i<n;i++){
            for (int j =0; j<m;j++){
                if (a[i][j] <10){
                    System.out.print(a[i][j] + "  ");
                } else {
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }
}
