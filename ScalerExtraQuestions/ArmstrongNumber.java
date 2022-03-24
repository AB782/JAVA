package ScalerExtraQuestions;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int temp = N;
        int sumOfCubes = 0;
        while(temp>0){
            int rem = temp%10;
            sumOfCubes += rem*rem*rem;
            temp/=10;
    }
        System.out.println(sumOfCubes);
        if(sumOfCubes==N){
            System.out.println("The number is an Armstrong Number");
        }



    }
}
