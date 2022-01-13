package Functions;

public class ChangeValue {
    public static void main(String[] args) {
        // create an array
        int[] arr = {1,2,4,3,6};

    }

    static void change(int[] nums){
        nums[0]= 12; // if you make a change to the object via this ref variable, same object will be changed
    }
}
