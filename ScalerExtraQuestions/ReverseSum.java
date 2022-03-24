package ScalerExtraQuestions;

import java.util.Scanner;

public class ReverseSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int temp = N;
        int reverse = 0;
        while(temp>0){
            int rem = temp%10;
            reverse = reverse*10+rem;
            temp = temp/10;
        }
        System.out.println(reverse+N);
    }
}
