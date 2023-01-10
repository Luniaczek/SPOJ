package GLUTTON;

// url: https://pl.spoj.com/problems/GLUTTON/


import java.util.*;
import java.lang.*;

class Main
{
    final static int SECONDPERDAY = 24 * 60 * 60;
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        int amountOfPackage = scanner.nextInt();
        for (int i = 0; i < amountOfPackage; i++) {
            int amountOfEaters = scanner.nextInt();
            int cookiesPerBox = scanner.nextInt();
            int cookiesEaten = 0;
            for (int j = 0; j < amountOfEaters; j++) {
                int eatingTime = scanner.nextInt();
                cookiesEaten += SECONDPERDAY/eatingTime;
            }
            double boxesToBuy = cookiesEaten/(double)cookiesPerBox;
            System.out.println((int)Math.ceil(boxesToBuy));

        }
    }
}