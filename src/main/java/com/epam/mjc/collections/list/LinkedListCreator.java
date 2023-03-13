package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < sourceList.size(); i++) {
            int num = sourceList.get(i);
            if ((i + 1) % 2 == 0) {
                list.addLast(num);
            } else {
                list.addFirst(num);
            }
        }
        return list;
    }
}
