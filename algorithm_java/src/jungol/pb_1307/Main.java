package jungol.pb_1307;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        char[][] arr = new char[n][n];

        char data = 'A';


        for (int i = n -1 ; i>=0 ; i--){
            for (int j=n-1 ; j>=0 ; j--){
                arr[j][i] = data;
                data++;
                data = (char)((data - 'A') % ('Z' - 'A' + 1) + 'A');
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
