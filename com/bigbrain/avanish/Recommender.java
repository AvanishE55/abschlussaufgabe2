package com.bigbrain.avanish;

import com.bigbrain.avanish.commandhandling.CommandHandler;

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

        CommandHandler handler = new CommandHandler();

        while (!input.equals(QUIT)) {
            handler.parseCommand(input.trim());
            input = scanner.nextLine();
        }

        scanner.close();
    }
}
