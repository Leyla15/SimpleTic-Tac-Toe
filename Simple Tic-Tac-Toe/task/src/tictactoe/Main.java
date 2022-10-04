package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        // String alalim
        System.out.println("---------");
        System.out.printf("| %s %s %s |\n| %s %s %s |\n| %s %s %s |",name.charAt(0),name.charAt(1),name.charAt(2),
                name.charAt(3),name.charAt(4),name.charAt(5),name.charAt(6),name.charAt(7),name.charAt(8));
        System.out.println("\n---------");


    }
}
