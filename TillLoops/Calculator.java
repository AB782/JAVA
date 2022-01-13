package TillLoops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the operation: ");
        char a = in.next().trim().charAt(0);
        int ans = 0;
        if (a == '*' || a == '/' || a == '+' || a == '-' || a == '%') {
            System.out.print("Enter two numbers: ");
            int first = in.nextInt();
            int sec = in.nextInt();
            if (a == '*') {
                ans = first * sec;
            }
            if (a == '/') {
                ans = first / sec;
            }
            if (a == '+') {
                ans = first + sec;
            }
            if (a == '-') {
                ans = first - sec;
            }
            if (a == '%') {
                ans = first % sec;

            } else if (a == 'x' || a == 'X') {
                System.out.println("operation over");
            }
        } else {
            System.out.println("Invalid Input");

        }
        System.out.println(ans);




    }
}
