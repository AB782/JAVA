package Functions;

import java.sql.Statement;

public class Swap {
    public static void main(String[] args) {
        String name = "Aayush Bansal";
        changeName(name);
        System.out.println(name);
//        int a = 10;
//         int b = 20;
//        // swap numbers code
//         int temp = a;
//         a = b;
//         b=temp;


//        System.out.println(a + " "+b);
    }
    static void changeName(String naam){
        naam = "Rahul Rana"; // creating a new object
    }


    static void swap(int a, int b){
        int temp = a;
        a=b;
        b = temp;

    }


}
