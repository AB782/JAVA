package TillLoops;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your roll number: ");
//        int rollNo = input.nextInt();
//        System.out.println("Your roll number is "+ rollNo);

        Scanner input = new Scanner(System.in);
        int num1= input.nextInt();
        int num2= input.nextInt();

        int sum = num1+num2;

        System.out.println("Sum of two numbers = "+ sum);
    }
}
