package MWPZ06X;

//url: https://pl.spoj.com/problems/MWPZ06X/

import java.util.*;
import java.lang.*;

class Main {
    public static void main (String[] args) throws java.lang.Exception
    {Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        for (int i = 1; i <= d ; i++) {
            int amountOfSteps = scanner.nextInt();
            System.out.println(countSquareMeters(amountOfSteps));
        }
    }

    private static int countSquareMeters (int amount){
        return amount*amount;
    }

}