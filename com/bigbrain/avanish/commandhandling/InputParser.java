package com.bigbrain.avanish.commandhandling;

import com.bigbrain.avanish.graph.Graph;
import com.bigbrain.avanish.util.Predicate;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * The type Command load.
 * @author uswup
 */
public final class InputParser {
    /**
     * The constant REGEX_SPLIT_LINE.
     */
    public static final String REGEX_SPLIT_LINE = "[ (=)]";

    /**
     * The Error message.
     */
    static final String ERROR_MESSAGE = "ERROR";

    private InputParser() {
    }

    /**
     * Load database.
     * @param path  the path
     * @param graph the graph
     */
    public static void loadDatabase(String path, Graph graph) {
        List<String> configFile;

        try {
            configFile = Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            System.out.println(ERROR_MESSAGE);
            return;
        }

        while (!configFile.isEmpty()) {
            addToGraph(configFile.remove(0), graph);
        }

        System.out.print("Done parsing file");


    }

    private static void addToGraph(String currentLine, Graph graph) {

        ArrayList<String> splitCurrentLine = new ArrayList<>(Arrays.asList(currentLine.trim().split(REGEX_SPLIT_LINE)));
        splitCurrentLine.removeAll(Collections.singleton(""));

        int predicateIndex = 0;

        for (String word : splitCurrentLine) {
            if (Predicate.getList().contains(word.toLowerCase())) {
                predicateIndex = splitCurrentLine.indexOf(word);
            }
        }

        if (predicateIndex == 0) {
            System.out.println("ERROR predicate not found");
            return;
        }


        graph.addToGraph(graph.getOrCreateNode(splitCurrentLine.subList(0, predicateIndex)),
                Predicate.valueOf(splitCurrentLine.get(predicateIndex)),
                graph.getOrCreateNode(splitCurrentLine.subList(0, predicateIndex)));


    }
}
