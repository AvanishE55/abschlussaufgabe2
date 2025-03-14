package com.bigbrain.avanish.graph;

import com.bigbrain.avanish.util.Predicate;

public class Edge {
    Node fromNode;
    Node toNode;
    Predicate predicate;

    public void Edge(Node fromNode, Node toNode, Predicate predicate){
        this.fromNode = fromNode;
        this.toNode = toNode;
        this.predicate = predicate;
    }



}
