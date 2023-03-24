package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> list = new ArrayList<>();
        int index = 1;
        for (String s : sourceList) {
            if (index%3==0) {
                list.add(s);
                list.add(s);
            }
            index++;
        }
        return list;
    }
}
