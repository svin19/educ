package ru.svin19.educ.educ08;

import java.util.ArrayList;
import java.util.List;

public class SimpleCollectionImpl<E> implements SimpleCollection<E> {
    private  final List<E> list = new ArrayList();

    @Override
    public void add(E o) {
        list.add(o);
    }

    @Override
    public E getLast() {
        return list.get(list.size()-1);
    }
}
