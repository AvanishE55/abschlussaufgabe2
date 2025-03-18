package com.bigbrain.avanish.graph;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Node.
 * @author uswup
 */
public abstract class Node {
    /**
     * The Name.
     */
    final String name;

    /**
     * The Edges.
     */
    final List<Edge> edges = new ArrayList<>();

    /**
     * Instantiates a new Node.
     * @param name the name
     */
    protected Node(String name) {
        this.name = name;
    }

    /**
     * Add edge.
     * @param edge the edge
     */
    public void addEdge(Edge edge) {
        edges.add(edge);

    }

    /**
     * Gets edges.
     * @return the edges
     */
    public List<Edge> getEdges() {
        return edges;
    }

    /**
     * Gets name.
     * @return the name
     */
    public String getName() {
        return name;
    }
}
