package FunctionsAssignment;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        System.out.println(PrimeCheck());


    }

    private static boolean PrimeCheck() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
