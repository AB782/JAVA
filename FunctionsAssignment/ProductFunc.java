package FunctionsAssignment;

import java.util.Scanner;

public class ProductFunc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = in.nextInt();
        System.out.println("Enter second number: ");
        int b = in.nextInt();
        int ans = Prod(a, b);
        System.out.println("The product of two numbers is: "+ans);


    }

    static int Prod(int a, int b) {
        int ans = a*b;
        return ans;
    }
}
