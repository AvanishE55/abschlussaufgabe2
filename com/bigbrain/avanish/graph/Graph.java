package com.bigbrain.avanish.graph;

import com.bigbrain.avanish.util.Predicate;

import java.util.ArrayList;
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
    HashMap<String, Node> nodeHashMap = new HashMap<>();
    /**
     * The Edge hash map.
     */
    HashMap<Node, List<Edge>> edgeHashMap = new HashMap<>();

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
    public void add(Node sourceNode, Predicate predicate, Node targetNode) {
        if (!edgeHashMap.containsKey(sourceNode)) {
            edgeHashMap.put(sourceNode, new ArrayList<>());
        }
        edgeHashMap.get(sourceNode).add(new Edge(sourceNode, predicate, targetNode));

        if (!edgeHashMap.containsKey(targetNode)) {
            edgeHashMap.put(targetNode, new ArrayList<>());
        }
        edgeHashMap.get(sourceNode).add(new Edge(targetNode, Predicate.getInversePredicate(predicate), sourceNode));


    }

    /**
     * Gets an existing node from ore creates a new one.
     * @param strings the strings
     * @return the or create node
     */
    public Node getOrCreateNode(List<String> strings) {
        String name = strings.get(0).toLowerCase();

        if (nodeHashMap.containsKey(name)) {
            return nodeHashMap.get(name);
        }

        if (strings.contains("id")) {
            int id = Integer.parseInt(strings.get((strings.indexOf("id") + 1)));
            ProductNode productNode = new ProductNode(name, id);
            nodeHashMap.put(name, productNode);
            return productNode;
        } else {
            CategoryNode categoryNode = new CategoryNode(name);
            nodeHashMap.put(name, categoryNode);
            return categoryNode;
        }


    }
}
