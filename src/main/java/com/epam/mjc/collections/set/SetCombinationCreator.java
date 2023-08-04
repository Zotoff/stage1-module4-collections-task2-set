package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> combinationSet = new HashSet<>();
        for (String arg : thirdSet) {
            if (!firstSet.contains(arg) && !secondSet.contains(arg)) {
                combinationSet.add(arg);
            }
        }
        for (String arg : firstSet){
            if (secondSet.contains(arg) && !thirdSet.contains(arg)){
                combinationSet.add(arg);
            }
        }
        return combinationSet;
    }
}
