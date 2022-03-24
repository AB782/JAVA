package BinarySearchAssignments;

public class SmallestLetter {
    public static void main(String[] args) {
        int letters[] = {'c','f','g'};
        int target = 'c';
        int ans = SmallestLetter(letters, target );
        System.out.println(ans);
    }
    static int SmallestLetter(int letters[], int target){
        int start = 0;
        int end = letters.length -1;

        while (start<=end){
            int mid = start+(end-start)/2;
            if (target<letters[mid]){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return letters[start% letters.length];
    }
}
