package BinarySearch;

import java.util.Scanner;

public class BinarySearchWithInput {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int length = in.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the elements for array: ");
        for (int i = 0; i < length; i++) {
            arr[i] = in.nextInt();
        }

        int ans = Binary(arr);
        System.out.println(ans);
    }

    static int Binary(int[] arr) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the target element to find it's index");
        int target = in.nextInt();
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = start+(end-start)/2;

            if (target < arr[mid]) {
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target == arr[mid]) {
                return mid;
            } else {
                return mid;
            }

        }
        return -1;
    }
}
