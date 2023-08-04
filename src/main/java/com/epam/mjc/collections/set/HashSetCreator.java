package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();
        if (sourceList.size() == 1) {
            int num = sourceList.get(0);
            hashSet.add(num);
            if (num % 2 == 0) {
                int x = num;
                while (x >= 1) {
                    hashSet.add(x);
                    x /= 2;
                }
            } else {
                hashSet.add(num * 2);
            }

        } else {
            for (int arg : sourceList) {
                hashSet.add(arg);
                if (arg % 2 == 0) {
                    hashSet.add(arg / 2);
                } else {
                    hashSet.add(arg * 2);
                }
            }
        }

        return hashSet;
    }
}
