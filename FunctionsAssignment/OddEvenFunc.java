package FunctionsAssignment;

import java.util.Scanner;

public class OddEvenFunc {
    public static void main(String[] args) {
        System.out.println("Welcome to the program to check if a number is odd or even");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = in.nextInt();
        OddEven(a);

    }
    static void OddEven(int a){
        if (a%2==0){
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }
    }

}
