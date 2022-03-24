package ScalerExtraQuestions;

import java.util.Scanner;

public class PerfectNumber {

    public static boolean isPerfect(int n) {
        int sumOfDivisors = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) sumOfDivisors += i;
        }
        if (sumOfDivisors == n) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i < n; i++) {
            if (isPerfect(i)) System.out.println(i);
        }
    }
}
