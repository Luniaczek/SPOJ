package Easy.SUMA;
//url: https://pl.spoj.com/problems/SUMA/

import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            sum += a;
            System.out.println(sum);
        }
    }
}

