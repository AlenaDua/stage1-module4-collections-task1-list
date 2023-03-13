package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
    static class ListComparator implements Comparator<String> {
        @Override
        public int compare(String a, String b) {
            int aVal = Integer.parseInt(a);
            int bVal = Integer.parseInt(b);
            int aFuncVal = 5 * aVal * aVal + 3;
            int bFuncVal = 5 * bVal * bVal + 3;
            if (aFuncVal == bFuncVal) {
                return Integer.compare(aVal, bVal);
            } else {
                return Integer.compare(aFuncVal, bFuncVal);
            }
        }
    }
}


class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        return 0;
    }
}
