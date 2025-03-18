package com.bigbrain.avanish.commandhandling;

import com.bigbrain.avanish.graph.Graph;

/**
 * The type Command handler.
 *
 * @author uswup
 */
public final class CommandHandler {

    private final String LOAD = "load";
    private final String ADD = "add";
    private final String REMOVE = "remove";
    private final String NODE = "node";
    private final String EDGES = "edges";
    private final String RECOMMEND = "recommend";
    private Graph graph;

    public CommandHandler() {
    }

    /**
     * Parse command.
     *
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
