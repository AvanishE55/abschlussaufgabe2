package com.bigbrain.avanish.commandhandling;

import com.bigbrain.avanish.graph.Graph;
import com.bigbrain.avanish.graph.Node;
import com.bigbrain.avanish.util.Predicate;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The type Command load.
 * @author uswup
 */
public final class InputParser {
    private static final String ERROR_MESSAGE = "ERROR";
    private static final String REGEX_SPLIT_LINE = "[ (=)]";
    private static final List<String> REMOVE_LIST = List.of(new String[]{"", "add", "remove"});

    /**
     * Instantiates a new Input parser.
     */
    public InputParser() {
    }

    /**
     * Splits input line. For everything except command load it splits it by empty spaces only once so that the parsing can be done later.
     * @param input the input
     * @return the string [ ]
     */
    public static String[] splitLine(String input) {
        String[] returnArray = new String[0];

        if (input.startsWith("load")) {
            returnArray = input.split(" ");
        } else {
            returnArray = input.split(" ", 2);
        }

        return returnArray;
    }

    /**
     * Load database.
     * @param path          the path
     * @param originalGraph the original graph
     * @return the graph
     */
    public Graph loadDatabase(String path, Graph originalGraph) {
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

        ArrayList<String> addParams = new ArrayList<>(Arrays.asList(currentLine.trim().split(REGEX_SPLIT_LINE)));
        addParams.removeAll(REMOVE_LIST);

        int predicateIndex = 0;

        for (String word : addParams) {
            if (Predicate.getList().contains(word.toLowerCase())) {
                predicateIndex = addParams.indexOf(word);
            }
        }

        //Do implement regex checking of the names

        if (predicateIndex == 0) {
            System.out.println("ERROR predicate not found");
            return false;
        }


        Node sourceNode = graph.getOrCreateNode(addParams.subList(0, predicateIndex));
        Predicate predicate = Predicate.getPredicate(addParams.get(predicateIndex));
        Node targetNode = graph.getOrCreateNode(addParams.subList(predicateIndex + 1, addParams.toArray().length));

        if (sourceNode == null || targetNode == null || predicate ==null) {
            return false;
        }

        graph.add(sourceNode, predicate, targetNode);
        graph.add(targetNode, Predicate.getInversePredicate(predicate), sourceNode);

        return true;
    }

    public boolean removeFromGraph(String currentLine, Graph graph) {



        return true;
    }
}
