package com.bigbrain.avanish.graph;

import com.bigbrain.avanish.util.Relationship;

public class Edge {
    Node fromNode;
    Node toNode;
    Relationship relationship;

    public void Edge(Node fromNode, Node toNode, Relationship relationship){
        this.fromNode = fromNode;
        this.toNode = toNode;
        this.relationship = relationship;
    }



}
