package com.bigbrain.avanish;

import java.util.Scanner;

/**
 * The type Application.
 *
 * @author uswup
 */
public final class Recommender {

    private static final String QUIT = "quit";
    /**
     * The Scanner.
     */
    private static Scanner scanner;

    private Recommender() {
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals(QUIT)) {
            CommandHandler.parseCommand(input.trim().split(" "));
            input = scanner.nextLine();
        }
    }
}
