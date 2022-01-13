package Functions;

public class StringExample {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);

        String personalised = myGreet("Aayush");

        }
        static String myGreet(String name){
        String message= "hello" + name;
        return message;

    }
    static String greet() {
        String greeting = "how are you";

        return greeting;
    }
}
