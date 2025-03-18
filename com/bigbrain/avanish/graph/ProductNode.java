package com.bigbrain.avanish.graph;


import java.util.List;

/**
 * The type Product node.
 * @author uswup
 */
public class ProductNode extends Node {
    private final int id;

    /**
     * Instantiates a new Product node.
     * @param name the name
     * @param id   the id
     */
    public ProductNode(String name, int id) {
        super(name);
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
