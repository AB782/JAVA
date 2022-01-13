package FunctionsAssignment;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        System.out.println(Check());

    }
        static String Check () {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the largest number: ");
            int a = in.nextInt();
            System.out.print("Enter second number: ");
            int b = in.nextInt();
            System.out.print("Enter third number: ");
            int c = in.nextInt();
            if (a * a == (b * b) + (c * c)) {
                return "The number is a pythagorean triplet";
            } else {
                return "The number isn't a pythagorean triplet";
            }

        }
    }




