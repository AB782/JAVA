package BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int []arr = {1, 5, 6, 7, 10, 23, 45, 66, 89};
        int []arr = {24,22,12,10,4,1};
        int target = 10;
        int ans = OrderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int OrderAgnosticBS(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;

                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
