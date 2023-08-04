package com.epam.mjc.collections.set;

import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        NavigableSet<Integer> res = new TreeSet<>();
        for (int value : sourceList) {
            res.add(value * value);

        }
        return res.subSet(lowerBound,true,upperBound,true);
    }
}
