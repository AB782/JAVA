package Functions;

public class Scoping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        {
            a= 40;
            System.out.println("Value of a inside the block"+a);
            // we can change the values inside the block
            // but we cannot initialise it again

        }
        System.out.println("Value of a outside the block: "+a);

    }
    static void random(){
        int marks= 599;
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}

