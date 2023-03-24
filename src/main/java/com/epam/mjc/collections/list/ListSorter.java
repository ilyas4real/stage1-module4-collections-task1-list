package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        ListComparator comparator = new ListComparator();
        Collections.sort(sourceList, comparator);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int x1 = Integer.parseInt(a);
        int x2 = Integer.parseInt(b);
        int y1 = 5*x1*x1+3;
        int y2 = 5*x2*x2+3;
        if (y1!=y2) {
            return Integer.compare(y1,y2);
        } else {
            return Integer.compare(x1,x2);
        }
    }
}
