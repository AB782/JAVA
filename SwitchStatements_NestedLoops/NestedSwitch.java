package SwitchStatements_NestedLoops;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        System.out.print("Enter Name: ");
        Scanner in = new Scanner(System.in);
        int name = in.nextInt();
        System.out.print("Enter Job(if any): ");
        String job = in.next();
        switch (name) {
            case 1 -> System.out.println("Aayush");
            case 2 -> System.out.println("Divya");
            case 3 -> System.out.println("Rita");
            case 4 -> {
                System.out.println("Vishal");
                switch (job) {
                    case "One" -> System.out.println("IT head");
                    case "Two" -> System.out.println("Branch Manager");
                    case "Three" -> System.out.println("CEO");
                }
            }
        }
        System.out.print(name);
        System.out.println(job);
    }
}
