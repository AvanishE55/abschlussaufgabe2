package com.bigbrain.avanish.commandhandling;

import com.bigbrain.avanish.graph.Graph;

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
public final class CommandLoad {

    /**
     * The Error message.
     */
    static final String ERROR_MESSAGE = "ERROR";
    private static final List<String> removeList = Arrays.asList("(id=", "(", ")", "id", "id=" );
    public static final String REGEX_SPLIT_LINE = "[ (=)]";

    private CommandLoad() {
    }

    /**
     * Load database.
     * @param path the path
     */
    public static Graph loadDatabase(String path) {
        List<String> configFile;
        ArrayList<ArrayList<String>> parsedConfigFile = new ArrayList<>();

        try {
            configFile = Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            System.out.println(ERROR_MESSAGE);
            return null;
        }


        while (!configFile.isEmpty()) {
            ArrayList<String> splitCurrentLine = new ArrayList<>(Arrays.asList(configFile.remove(0).trim().split(REGEX_SPLIT_LINE)));
            splitCurrentLine.removeAll(Collections.singleton(""));
            parsedConfigFile.add(splitCurrentLine);
        }


        Graph graph = toGraph(parsedConfigFile);

        System.out.print("Done parsing file");

        return graph;


    }

    private static Graph toGraph(ArrayList<ArrayList<String>> parsedConfigFile) {
        Graph graph = new Graph();

        for (ArrayList<String> line : parsedConfigFile){
            line.indexOf("id");

        }

        return graph;
    }
}
