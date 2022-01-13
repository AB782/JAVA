package FunctionsAssignment;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();
        int ans = Sum(a,b);
        System.out.print("The sum of two numbers is: "+ans);

    }

    static int Sum(int a, int b) {
        int sum = a+b;
        return sum;
    }

}
