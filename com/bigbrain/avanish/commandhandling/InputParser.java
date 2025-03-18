package com.bigbrain.avanish.commandhandling;

import com.bigbrain.avanish.graph.Graph;
import com.bigbrain.avanish.graph.Node;
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

    /**
     * Instantiates a new Input parser.
     */
    public InputParser() {
    }

    /**
     * Load database.
     * @param path          the path
     * @param originalGraph the original graph
     * @return the graph
     */
    public Graph loadDatabase(String path, Graph originalGraph) {

        //TODO implement checking if graph is successfully made
        Graph graph = new Graph();

        List<String> configFile;

        try {
            configFile = Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            System.out.println(ERROR_MESSAGE);
            return originalGraph;
        }

        boolean addSuccess = true;

        while (!configFile.isEmpty() && addSuccess) {
            addSuccess = addToGraph(configFile.remove(0), graph);
        }

        if (addSuccess) {
            return graph;
        } else {
            return originalGraph;
        }
    }

    /**
     * Add to graph.
     * @param currentLine the current line
     * @param graph       the graph
     * @return the boolean
     */
    public boolean addToGraph(String currentLine, Graph graph) {
        ArrayList<String> splitCurrentLine = new ArrayList<>(Arrays.asList(currentLine.trim().split(REGEX_SPLIT_LINE)));
        splitCurrentLine.removeAll(Collections.singleton(""));

        int predicateIndex = 0;

        for (String word : splitCurrentLine) {
//            word = word.toLowerCase();
            if (Predicate.getList().contains(word.toLowerCase())) {
                predicateIndex = splitCurrentLine.indexOf(word);
            }
        }

        //TODO implement regex checking of the names

        if (predicateIndex == 0) {
            System.out.println("ERROR predicate not found");
            return false;
        }


        Node sourceNode = graph.getOrCreateNode(splitCurrentLine.subList(0, predicateIndex));
        Node targetNode = graph.getOrCreateNode(splitCurrentLine.subList(predicateIndex + 1, splitCurrentLine.toArray().length));

        graph.add(sourceNode,
                Predicate.getPredicate(splitCurrentLine.get(predicateIndex)),
                targetNode);

        return true;
    }
}
