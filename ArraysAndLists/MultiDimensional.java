package ArraysAndLists;

import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        1 2 3
        4 5 6
        7 8 9
         */

//        int[][] arr = new int[3][]
//        int[][] arr = {
//                {1, 2, 3},// 0th index
//                {4, 5, 6},// !st index
//                {7, 8, 9}//@nd index -> arr@d[2] = {6,7,8,9}
//        };

        // input
        int array[][] = new int[3][3];
        System.out.println(array.length);
        for (int row = 0; row < array.length; row++) {
            // for each col in every row
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = in.nextInt();

            }
        }
        // output
            for (int row = 0; row < array.length; row++) {
                // for each col in every row
                for (int col = 0; col < array[row].length; col++) {
                    System.out.print(array[row][col] + " ");

        // output


                }
                System.out.println();
            }
        }
    }

