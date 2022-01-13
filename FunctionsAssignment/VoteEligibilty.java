package FunctionsAssignment;

import java.util.Scanner;

public class VoteEligibilty {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter age of candidate: ");
        int a = in.nextInt();
        Check(a);
    }
    static void Check(int a){
        if (a>18){
            System.out.println("The candidate is eligible to vote");

        }
        else {
            System.out.println("Wait till you turn 18 ,dear");
        }
    }
}
