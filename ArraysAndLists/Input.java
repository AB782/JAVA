package ArraysAndLists;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // HOW TO INPUT IN JAVA
        // syntax
        // datatype[] variable_name = new datatype[size];
        int [] first = new int[5];
        first[0]=1;
        first[1]= 12;
        first[2]= 21;
        first[3] = 45;
        first[4]= 13;
        System.out.println(first[2]);

        int[] second = new int[5];

        for (int i=0; i<second.length; i++){
            second[i]= in.nextInt();

        }
        System.out.println(second.toString());

    }



}
