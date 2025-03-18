package com.bigbrain.avanish.util;

import java.util.Arrays;
import java.util.List;

/**
 * The enum Predicate.
 * @author uswup
 */
public enum Predicate {
    /**
     * Contains predicate.
     */
    CONTAINS,
    /**
     * Contained in predicate.
     */
    CONTAINED_IN,
    /**
     * Part of predicate.
     */
    PART_OF,
    /**
     * Has part predicate.
     */
    HAS_PART,
    /**
     * Successor of predicate.
     */
    SUCCESSOR_OF,
    /**
     * Predecessor of predicate.
     */
    PREDECESSOR_OF;

    private static final List<String> PREDICATE_LIST =
            Arrays.asList("contains", "contained-in", "part-of", "has-part", "successor-of", "predecessor-of");

    /**
     * Gets list.
     * @return the list
     */
    public static List<String> getList() {
        return PREDICATE_LIST;
    }
}
