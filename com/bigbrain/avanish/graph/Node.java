package com.bigbrain.avanish.graph;

import java.util.ArrayList;
import java.util.List;

public abstract class Node {
    final String name;

    final List<Edge> edges = new ArrayList<>();

    protected Node(String name) {
        this.name = name;
    }

    public void addEdge(Edge edge) {

    }

    public List<Edge> getEdges() {
        return edges;
    }

    public String getName() {
        return name;
    }
}
