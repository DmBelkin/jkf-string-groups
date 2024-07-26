package ru.sendel;

import java.util.ArrayList;
import java.util.List;

public class SingleString {
    private final List<String> substrings = new ArrayList<>();

    public boolean isSameGroup(SingleString other) {
        var little = elementsCount() > other.elementsCount()
                ? other : this;

        for (var i = 0; i < little.elementsCount(); i++) {
            if (little.substrings.get(i).equals(substrings.get(i))) {
                return true;
            }
        }
        return false;
    }

    private int elementsCount() {
        return substrings.size();
    }
}
