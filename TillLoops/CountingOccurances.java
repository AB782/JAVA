package TillLoops;

import java.util.Scanner;

public class CountingOccurances {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter the number: ");
        int a = in.nextInt();
        System.out.print("Enter the digit you want to find: ");
        int b = in.nextInt();
        while (a>0){
            int rem = a%10;
                if (rem==b){
                    count++;

                }
                a = a/10;
            }
        System.out.println(count);

        }
    }

