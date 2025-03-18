package com.bigbrain.avanish.graph;

import com.bigbrain.avanish.util.Predicate;

/**
 * The type Edge.
 * @author uswup
 */
public class Edge {

    private final Node sourceNode;
    private final Node targetNode;

    private final Predicate predicate;

    /**
     * Edge.
     * @param sourceNode the from node
     * @param predicate  the predicate
     * @param targetNode the to node
     */
    public Edge(Node sourceNode, Predicate predicate, Node targetNode) {
        this.sourceNode = sourceNode;
        this.predicate = predicate;
        this.targetNode = targetNode;
    }

    /**
     * Gets predicate.
     * @return the predicate
     */
    public Predicate getPredicate() {
        return predicate;
    }

    /**
     * Gets target node.
     * @return the target node
     */
    public Node getTargetNode() {
        return targetNode;
    }

    /**
     * Gets source node.
     * @return the source node
     */
    public Node getSourceNode() {
        return sourceNode;
    }
}
