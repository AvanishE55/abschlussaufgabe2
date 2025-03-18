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

    public static Predicate getPredicate(String s) {
        return switch (s) {
            case "contains" -> CONTAINS;
            case "contained-in" -> CONTAINED_IN;
            case "part-of" -> PART_OF;
            case "has-part" -> HAS_PART;
            case "successor-of" -> SUCCESSOR_OF;
            case "predecessor-of" -> PREDECESSOR_OF;
            default -> null;
        };
    }

    public static Predicate getInversePredicate(Predicate predicate) {
        return switch (predicate) {
            case CONTAINED_IN -> CONTAINS;
            case CONTAINS -> CONTAINED_IN;
            case HAS_PART -> PART_OF;
            case PART_OF -> HAS_PART;
            case PREDECESSOR_OF -> SUCCESSOR_OF;
            case SUCCESSOR_OF -> PREDECESSOR_OF;
        };
    }
}
