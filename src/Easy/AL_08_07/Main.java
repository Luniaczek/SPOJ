package Easy.AL_08_07;

//url: https://pl.spoj.com/problems/AL_08_07/

import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        for (int i = 0; i < testCase; i++) {
            int amountOfSteps = scanner.nextInt();
            System.out.println(compute(amountOfSteps));
        }
    }

    private static int compute(int movesCount) {

        int base = 1;
        if (movesCount == 1) {
            return 8;
        } else if (movesCount == 2) {
            base = 16;
        } else if (movesCount == 3) {
            base = 25;
        } else {
            base = 7 * (movesCount - 3) + 25;
        }
        return base * movesCount + 1;
    }
}