package FunctionsAssignment;

import java.util.Scanner;

public class FactorialFunction {
    public static void main(String[] args) {
        System.out.println("Enter number :");
        System.out.print("The Factorial of the number is: " + Factorial());
    }

     static int Factorial() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i=1;
        int fac = 1;
         while (i <= n) {
             fac*=i;
             i+=1;
         }
         return fac;

        }



    }

