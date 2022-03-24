package BinarySearchAssignments;

public class InfiniteArray {
    public static void main(String[] args) {
        int arr[] = {12, 24, 36, 48, 60 , 72, 84, 96, 108, 120};
        int target = 84;
        System.out.println(ans(arr,target));
    }

    static int ans(int arr[], int target) {
        int start = 0;
        int end = 1;
        while (target>arr[end]){
            int temp = end+1;
            // this temp will be the new start
            // doubling the previous end
            end = start+(end-start+1)*2;
            start = temp;
        }
        return BinarySearch(arr,target,start,end);
    }

    static int BinarySearch(int arr[], int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
