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
     * The constant STRING_ID.
     */
    public static final String STRING_ID = "id";
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
        } else{
            for (Edge edge : edgeHashMap.get(sourceNode)){
                if(edge.getPredicate().equals(predicate) && edge.getTargetNode().equals(targetNode)){
                    System.out.println("ERROR this relationship already exists");
                    return;
                }
            }
        }
        edgeHashMap.get(sourceNode).add(new Edge(sourceNode, predicate, targetNode));
    }

    /**
     * Gets an existing node from ore creates a new one.
     * @param strings the strings
     * @return the or create node
     */
    public Node getOrCreateNode(List<String> strings) {
        String name = strings.get(0).toLowerCase();
        Node node;

        if (nodeHashMap.containsKey(name)) {
            return nodeHashMap.get(name);
        }

        if (strings.contains(STRING_ID)) {
            int id = 0;
            try {
                id = Integer.parseInt(strings.get((strings.indexOf(STRING_ID) + 1)));
            } catch (NumberFormatException ignored) {
                System.out.println("ERROR in parsing in while create Product node: " + name);
                return null;
            }
            node = new ProductNode(name, id);
            nodeHashMap.put(name, node);
        } else {
            node = new CategoryNode(name);
            nodeHashMap.put(name, node);
        }

        return node;
    }

    /**
     * Remove.
     */
    public void remove() {
    }
}
