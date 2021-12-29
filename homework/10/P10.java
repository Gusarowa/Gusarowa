public class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 8;
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = 0;
            }
        }
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            a[sc.nextInt()][sc.nextInt()] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 2) { // con xe
                    for (int u = i + 1; u < n; u++) { // di xuong
                        if (a[u][j] != 1 && a[u][j] != 0) {
                            break;
                        }
                        if (a[u][j] != 2) {
                            a[u][j] = 1;
                        }
                    }
                    for (int u = i - 1; u >= 0; u--) { // di len
                        if (a[u][j] != 1 && a[u][j] != 0) {
                            break;
                        }
                        if (a[u][j] != 2) {
                            a[u][j] = 1;
                        }
                    }
                    for (int v = j + 1; v < n; v++) { // sang phai
                        if (a[i][v] != 1 && a[i][v] != 0) {
                            break;
                        }
                        if (a[i][v] != 2) {
                            a[i][v] = 1;
                        }
                    }
                    for (int v = j - 1; v >= 0; v--) { // sang trai
                        if (a[i][v] != 1 && a[i][v] != 0) {
                            break;
                        }
                        if (a[i][v] != 2) {
                            a[i][v] = 1;
                        }
                    }
                }
                if (a[i][j] == 3) { // con tuo.ng
                    int u = i;
                    int v = j;
                    while (u < n - 1 && v > 0) { // cheo xuong trai
                        if (a[u + 1][v - 1] != 0 && a[u + 1][v - 1] != 1) {
                            break;
                        }
                        if (a[u + 1][v - 1] != 3) {
                            a[u + 1][v - 1] = 1;
                        }
                        u++;
                        v--;
                    }
                    u = i;
                    v = j;
                    while (u < n - 1 && v < n - 1) { // cheo xuong phai
                        if (a[u + 1][v + 1] != 0 && a[u + 1][v + 1] != 1) {
                            break;
                        }
                        if (a[u + 1][v + 1] != 3) {
                            a[u + 1][v + 1] = 1;
                        }
                        u++;
                        v++;
                    }
                    u = i;
                    v = j;
                    while (u > 0 && v > 0) { // cheo len trai
                        if (a[u - 1][v - 1] != 0 && a[u - 1][v - 1] != 1) {
                            break;
                        }
                        if (a[u - 1][v - 1] != 3) {
                            a[u - 1][v - 1] = 1;
                        }
                        u--;
                        v--;
                    }
                    u = i;
                    v = j;
                    while (u > 0 && v < n - 1) { // cheo len phai
                        if (a[u - 1][v + 1] != 0 && a[u - 1][v + 1] != 1) {
                            break;
                        }
                        if (a[u - 1][v + 1] != 3) {
                            a[u - 1][v + 1] = 1;
                        }
                        u--;
                        v++;
                    }
                }
                if (a[i][j] == 4) { // con ma~
                    int u = i;
                    int v = j;
                    if (v >= 2 && v <= 5) { // di ngang
                        if (u == 0) {
                            if (a[u + 1][v - 2] == 0 || a[u + 1][v - 2] == 1) { // di xuong trai
                                a[u + 1][v - 2] = 1;
                            }
                        } else if (u == 7) {
                            if (a[u - 1][v - 2] == 0 || a[u - 1][v - 2] == 1) { // di len trai
                                a[u - 1][v - 2] = 1;
                            }
                        } else {
                            if (a[u - 1][v - 2] == 0 || a[u - 1][v - 2] == 1) { // di len trai
                                a[u - 1][v - 2] = 1;
                            }
                            if (a[u + 1][v - 2] == 0 || a[u + 1][v - 2] == 1) { // di xuong trai
                                a[u + 1][v - 2] = 1;
                            }
                        }

                        if (u == 0) {
                            if (a[u + 1][v + 2] == 0 || a[u + 1][v + 2] == 1) { // di xuong phai
                                a[u + 1][v + 2] = 1;
                            }
                        } else if (u == 7) {
                            if (a[u - 1][v + 2] == 0 || a[u - 1][v + 2] == 1) { // di len phai
                                a[u - 1][v + 2] = 1;
                            }
                        } else {
                            if (a[u - 1][v + 2] == 0 || a[u - 1][v + 2] == 1) { // di len phai
                                a[u - 1][v + 2] = 1;
                            }
                            if (a[u + 1][v + 2] == 0 || a[u + 1][v + 2] == 1) { // di xuong phai
                                a[u + 1][v + 2] = 1;
                            }
                        }

                    }

                    if (u >= 2 && u <= 5) { // di doc
                        if (v == 0) {
                            if (a[u - 2][v + 1] == 0 || a[u - 2][v + 1] == 1) { // di len phai
                                a[u - 2][v + 1] = 1;
                            }
                        } else if (v == 7) {
                            if (a[u - 2][v - 1] == 0 || a[u - 2][v - 1] == 1) { // di len trai
                                a[u - 2][v - 1] = 1;
                            }
                        } else {
                            if (a[u - 2][v - 1] == 0 || a[u - 2][v - 1] == 1) { // di len trai
                                a[u - 2][v - 1] = 1;
                            }
                            if (a[u - 2][v + 1] == 0 || a[u - 2][v + 1] == 1) { // di len phai
                                a[u - 2][v + 1] = 1;
                            }

                        }

                        if (v == 0) {
                            if (a[u + 2][v + 1] == 0 || a[u + 2][v + 1] == 1) { // di xuong phai
                                a[u + 2][v + 1] = 1;
                            }
                        } else if (v == 7) {
                            if (a[u + 2][v - 1] == 0 || a[u + 2][v - 1] == 1) { // di xuong trai
                                a[u + 2][v - 1] = 1;
                            }
                        } else {
                            if (a[u + 2][v + 1] == 0 || a[u + 2][v + 1] == 1) { // di xuong phai
                                a[u + 2][v + 1] = 1;
                            }
                            if (a[u + 2][v - 1] == 0 || a[u + 2][v - 1] == 1) { // di xuong trai
                                a[u + 2][v - 1] = 1;
                            }

                        }

                    }

                }
            }
        }

        // for (int i = 0; i < n; i++) {
        // System.out.println(Arrays.toString(a[i]));
        // }
        k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            if (a[sc.nextInt()][sc.nextInt()] != 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // System.out.print(a[i][j] + " ");
        // }
        // System.out.println();
        // }
        // hihi haha
    }
}