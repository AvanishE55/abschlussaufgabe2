package com.bigbrain.avanish.util;

import java.util.Arrays;
import java.util.List;

public enum Predicate {
    CONTAINS,
    CONTAINED_IN,
    PART_OF,
    HAS_PART,
    SUCCESSOR_OF,
    PREDECESSOR_OF;

    private static final List<String> predicateList = Arrays.asList("contains", "contained-in", "part-of", "has-part", "successor-of", "predecessor-of");

    public static List<String> getList() {
        return predicateList;
    }
}
