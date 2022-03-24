package ScalerExtraQuestions;

import java.util.Scanner;

public class GaneshaPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int halfOfN = (N+1)/2;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if( (i<=halfOfN && j==1) || (i==halfOfN) || (i==1 && j>halfOfN) || (i == N && j<halfOfN) || (i>halfOfN && j==N) || (j == halfOfN) ){
                    System.out.print('*');
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
