package com.bigbrain.avanish.graph;

import com.bigbrain.avanish.util.Predicate;

/**
 * The type Edge.
 * @author uswup
 */
public class Edge {
    /**
     * The From node.
     */
    Node fromNode;
    /**
     * The To node.
     */
    Node toNode;
    /**
     * The Predicate.
     */
    Predicate predicate;

    /**
     * Edge.
     * @param fromNode  the from node
     * @param toNode    the to node
     * @param predicate the predicate
     */
    public Edge(Node fromNode, Node toNode, Predicate predicate) {
        this.fromNode = fromNode;
        this.toNode = toNode;
        this.predicate = predicate;
    }


}
