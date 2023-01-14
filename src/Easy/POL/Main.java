package Easy.POL;
//url: https://pl.spoj.com/problems/POL/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < t; i++) {
            String k = scanner.nextLine();
            System.out.println(k.substring(0, k.length()/2));
        }
    }
}
