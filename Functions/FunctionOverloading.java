package Functions;

public class FunctionOverloading {
    public static void main(String[] args) {


        // Function Overloading is using two functions with same name but with different parameters

        fun(56);
        fun("Aayush");
        int ans = sum(2,4,5 );

    }
    static int sum(int a , int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }

    static void fun(int a ){
        System.out.println(a);

    }

    static void fun(String name){
        System.out.println(name);

    }
}
