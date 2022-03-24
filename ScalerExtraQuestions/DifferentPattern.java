package ScalerExtraQuestions;

import java.util.Scanner;

public class DifferentPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int k = 1;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N-i; j++) {
                System.out.print(0+" ");
            }
            for (int j = 1; j <= (2*k)-1; j++) {
                System.out.print( (N-i+1)*j + " ") ;
            }
            for (int j = 1; j <=N-i; j++) {
                System.out.print(0+" ");
            }
            k+=1;
            System.out.println();
        }
    }
}
