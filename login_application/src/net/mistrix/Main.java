package net.mistrix;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println("------------------");
        System.out.println("Application Up to date!");
        System.out.println("This is for legal reasons");
        System.out.println("Made by Mistrix");
        System.out.println("Version 1.0.0");
        System.out.println("------------------");

        int x = 1; // main version
        int u = 1; // newest version
        System.out.println("Started Login Checker");

        System.out.println("Current Version: " + u);

        System.out.println("Login Checker Completed");

        System.out.println("------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter business name:");
        String input = scanner.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Type in your Username:");
        String input2 = scanner.nextLine();
        
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Type in your 4 digit Security Password");
        String input3 = scanner.nextLine();

        System.out.println("Welcome " + input);
        System.out.println("Thanks for using our Login Application");
        System.out.println("You logged in successfully");

        System.out.println("------------------");

        int a = 1000;
        int b = 234;

        int result = a + b;

        System.out.println("Your Admin Password is: " + result);
        System.out.println("Do not share this password!");

        System.out.println("------------------");

        System.out.println("Loading lasted: " + Math.random());
        System.out.println("Your all set now!");

        System.out.println("------------------");

        boolean IsAdmin = true;
        boolean JavaDevelopment = true;

        System.out.println("Is an Admin: " + IsAdmin);
        System.out.println("Is in Business: " + JavaDevelopment);

        System.out.println("------------------");
        





    }
}

