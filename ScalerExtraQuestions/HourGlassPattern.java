package ScalerExtraQuestions;

import java.util.Scanner;

public class HourGlassPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 1; i <=(N*2)+1 ; i++) {
            for (int j = N; j >= 0; j++) {
                int k = 0;
                System.out.println(j-k);
                k+=1;
            }
        }
    }
}
