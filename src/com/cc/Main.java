package com.cc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String n = "";
            System.out.println("Welcome to the ordering system!");
            System.out.println("Press q at any time to quit\n");
            System.out.print("Please select an action (a/r): ");
            do {
                try {
                    n = in.nextLine();
                    // break early
                    if ("q".equalsIgnoreCase(n)) {
                        break;
                    }
                    // TODO: add your code here


                } catch (Exception e) {
                    System.out.println("Invalid response. Try again (or press q to quit)");
                }
                // Prompt again
                System.out.print("Please select an action (a/r): ");
            } while (!"q".equalsIgnoreCase(n));
        }
    }
}
