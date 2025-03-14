package com.bigbrain.avanish.commandhandling;

import com.bigbrain.avanish.graph.Graph;

/**
 * The type Command handler.
 *
 * @author uswup
 */
public final class CommandHandler {

    private static final String LOAD = "load";
    private static final String ADD = "add";
    private static final String REMOVE = "remove";
    private static final String NODE = "node";
    private static final String EDGES = "edges";
    private static final String RECOMMEND = "recommend";
    private static Graph graph;

    private CommandHandler() {
    }

    /**
     * Parse command.
     *
     * @param currentLine the current line
     */
    public static void parseCommand(String[] currentLine) {
        switch (currentLine[0]) {
            case LOAD:
                graph = CommandLoad.loadDatabase(currentLine[2]);

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
