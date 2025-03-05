package com.bigbrain.avanish;

import java.util.Scanner;

public class Application {
    public static final String QUIT = "quit";
    static Scanner scanner;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals(QUIT)) {
            CommandHandler.parseCommand(input.trim().split(" "));
            input = scanner.nextLine();

        }
    }
}
