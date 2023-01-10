package Easy.RNO_DOD;

// url: https://pl.spoj.com/problems/RNO_DOD/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int sum = 0;
            for (int j = 0; j < n; j++) {
                int x = scanner.nextInt();
                sum += x;
            }
            System.out.println(sum);
        }
    }
}
