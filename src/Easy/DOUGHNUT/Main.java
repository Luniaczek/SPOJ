package Easy.DOUGHNUT;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); //liczba testów

        for (int i = 0; i < t; i++) {
            int c = scanner.nextInt(); //liczba kotów
            int k = scanner.nextInt(); //ile kg może udźwignąć
            int w = scanner.nextInt(); //waga jednego pączka

            System.out.println(c*w > k ? "no" : "yes");
        }
    }
}
