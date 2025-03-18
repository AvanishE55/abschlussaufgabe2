package com.bigbrain.avanish.commandhandling;

import com.bigbrain.avanish.graph.Graph;

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
    private Graph graph;

    /**
     * Instantiates a new Command handler.
     */
    public CommandHandler() {
    }

    /**
     * Parse command.
     * @param currentLine the current line
     */
    public void parseCommand(String[] currentLine) {
        switch (currentLine[0]) {
            case LOAD:
                InputParser.loadDatabase(currentLine[2], graph);
                break;

            case ADD:
                break;

            case REMOVE:
                break;

            case NODE:
                break;

            case EDGES:
                break;

            case RECOMMEND:
                break;

            default:
                break;


        }
    }
}
