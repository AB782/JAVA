package TillLoops;

import java.util.Scanner;

public class CharCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        if (ch>='a' && ch<='z') {
            System.out.println("The character is in lowercase");
        }
        else {
            System.out.println("The character is in uppercase");
        }
        }
    }

