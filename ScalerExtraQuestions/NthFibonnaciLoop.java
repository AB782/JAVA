package ScalerExtraQuestions;

import java.util.Scanner;



public class NthFibonnaciLoop {

    static int fibonnaci(int nthNumber){
        int a = 0;
        int b = 1;
        int count = 2;
        if(nthNumber == 1){
            return 0;
        }
        while (count<nthNumber){
            int temp = b;
            b = b+a;
            a = temp;
            count++;
        }
        return b;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                int output = fibonnaci(count);
                System.out.print(output + " ");
                count++;
            }
            System.out.println();
        }


    }
}
