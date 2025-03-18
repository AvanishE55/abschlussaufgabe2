package com.bigbrain.avanish.graph;

import com.bigbrain.avanish.util.Predicate;

import java.util.HashMap;
import java.util.List;


/**
 * The type Graph.
 * @author uswup
 */
public class Graph {


    /**
     * The Node hash map.
     */
    HashMap<String, Node> nodeHashMap;
    /**
     * The Edge hash map.
     */
    HashMap<Node, List<Edge>> edgeHashMap;

    /**
     * Instantiates a new Graph.
     */
    public Graph() {
    }

    /**
     * Add to graph.
     * @param sourceNode the source node
     * @param predicate  the predicate
     * @param targetNode the target node
     */
    public void addToGraph(Node sourceNode, Predicate predicate, Node targetNode) {

    }

    /**
     * Gets or create node.
     * @param strings the strings
     * @return the or create node
     */
    public Node getOrCreateNode(List<String> strings) {

        return new CategoryNode("temp");
    }
}
