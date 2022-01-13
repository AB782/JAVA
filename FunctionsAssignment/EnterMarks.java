package FunctionsAssignment;

import java.util.Scanner;

public class EnterMarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter marks to calculate grade: ");
        int a = in.nextInt();
        System.out.print("Your grade is :" + Grade(a));

    }

    static String Grade(int a) {
        if (a < 0) {
            return "Invalid Marks";
        }
        if (a >= 91 & a <= 100) {
            return "AA";
        }
        if (a >= 81 & a <= 90) {
            return "AB";
        }
        if (a >= 71 & a <= 80) {
            return "BB";
        }
        if (a >= 61 & a <= 70) {
            return "BC";
        }
        if (a >= 51 & a <= 60) {
            return "CD";
        }
        if (a >= 41 & a <= 50) {
            return "DD";

        }
        if (a <= 40 & a >= 0) {
            return "Fail";
        }

        return "Program finished";


    }
}

