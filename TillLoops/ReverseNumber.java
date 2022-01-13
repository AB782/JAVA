package TillLoops;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = in.nextInt();
        int ans = 0;
        while (a>0){
            int rem = a%10;
            a /=10;
            ans = ans*10+rem;

        }
        System.out.print(ans);


    }
}
