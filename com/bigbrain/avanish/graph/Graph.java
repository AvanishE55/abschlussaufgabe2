package com.bigbrain.avanish.graph;

import com.bigbrain.avanish.util.Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

    public Node getOrCreateNode(List<String> strings) {

        return new CategoryNode("temp");
    }
}
