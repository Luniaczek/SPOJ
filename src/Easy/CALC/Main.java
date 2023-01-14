package Easy.CALC;
//url: https://pl.spoj.com/problems/CALC/


import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String op = scanner.next(Pattern.compile("[*/%+-]"));
            int number = scanner.nextInt();
            int number2 = scanner.nextInt();
            switch (op) {
                case "+":
                    System.out.println(number + number2);
                    break;
                case "-":
                    System.out.println(number - number2);
                    break;
                case "*":
                    System.out.println(number * number2);
                    break;
                case "/":
                    System.out.println(number / number2);
                    break;
                case "%":
                    System.out.println(number % number2);
                    break;
            }
        }
    }

}
