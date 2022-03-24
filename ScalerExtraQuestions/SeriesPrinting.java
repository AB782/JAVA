package ScalerExtraQuestions;

import java.util.Scanner;

public class SeriesPrinting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int count = 1;
        for(int i = 1; i<=n1; i++){
            int ans = (3*count)+2;
            if(ans % n2 == 0){
                count +=1;
                ans =(3*count)+2;
            }

            System.out.print(ans+ " ");
            count+=1;
        }

    }
}
