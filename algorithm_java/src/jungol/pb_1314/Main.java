package jungol.pb_1314;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        char[][] arr = new char[n][n];

        char data = 'A';


        for (int i = 0 ; i < n ; i++){
            if(i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    arr[j][i] = data;
                    data++;
                    data = (char) ((data - 'A') % ('Z' - 'A' + 1) + 'A');
                }
            }
            else {
                for (int j = n-1; j >= 0; j--) {
                    arr[j][i] = data;
                    data++;
                    data = (char) ((data - 'A') % ('Z' - 'A' + 1) + 'A');
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
