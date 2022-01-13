package FunctionsAssignment;

import java.util.Scanner;

public class MaxAndMinFunc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the program to find maximum and minimum of three numbers");
        System.out.println("Enter first number: ");
        int a = in.nextInt();
        System.out.println("Enter second number: ");
        int b = in.nextInt();
        System.out.println("Enter third number: ");
        int c = in.nextInt();
        Max(a,b,c);
        int big = Max(a,b,c);
        System.out.println("Maximum of three numbers: "+big);
        int small = Min(a,b,c);
        System.out.println("Minimum of three numbers: "+small);
    }
     public static int Max(int a,int b,int c) {

         int big = a;
         if (b > big) {
             big = b;
         }
         if (c > big){
             big = c;
         }
         return big;
     }
     static int Min(int a,int b ,int c){
        int small = a;
        if (b<small){
            small = b;
        }
        if (c<small){
            small = c;
        }
        return small;
    }
}
