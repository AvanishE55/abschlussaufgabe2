package com.bigbrain.avanish.commandhandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * The type Command load.
 * @author uswup
 */
public final class CommandLoad {

    /**
     * The Error message.
     */
    static final String ERROR_MESSAGE = "ERROR";

    private CommandLoad() {
    }

    /**
     * Load database.
     * @param path the path
     */
    public static void loadDatabase(String path) {
        List<String> configFile;

        try {
            configFile = Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            System.out.println(ERROR_MESSAGE);
            return;
        }

        while (!configFile.isEmpty()) {
            String[] currentLine = configFile.remove(0).trim().split(" ");

            if (currentLine.length == 1) {
                continue;
            }

        }


    }
}
