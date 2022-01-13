package Functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun(2,3,5,5,5,5,6,6,7);
        multiple(2,4,"rahul", "Kunal", "Aayush" );
    }

    static void demo(int...v){
        System.out.println(Arrays.toString(v));

    }
    static void multiple(int a, int b, String...v){

    }
    static void fun(int...v ){
        System.out.println(Arrays.toString(v));
    }
}
