package com.bigbrain.avanish.commandhandling;

import com.bigbrain.avanish.graph.Graph;

import java.util.Arrays;

/**
 * The type Command handler.
 * @author uswup
 */
public final class CommandHandler {

    private static final String LOAD = "load";
    private static final String ADD = "add";
    private static final String REMOVE = "remove";
    private static final String NODE = "node";
    private static final String EDGES = "edges";
    private static final String RECOMMEND = "recommend";
    private final InputParser inputParser;
    private Graph graph;

    /**
     * Instantiates a new Command handler.
     */
    public CommandHandler() {
        this.inputParser = new InputParser();
    }

    /**
     * Parse command.
     * @param currentLine the current line
     */
    public void parseCommand(String[] currentLine) {
        switch (currentLine[0]) {
            case LOAD:
                graph = inputParser.loadDatabase(currentLine[2], graph);
                break;

            case ADD:
                inputParser.addToGraph(Arrays.toString(currentLine), this.graph);
                break;

            case REMOVE:
                graph.remove();
                break;

            case NODE:
                break;

            case EDGES:
                break;

            case RECOMMEND:
                break;

            default:
                System.out.println("ERROR false command");
                break;


        }
    }
}
