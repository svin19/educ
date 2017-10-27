package ru.svin19.educ.educ08;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//
public class CollectionUtils {

    //Integer x = nonNull(list.get(7));
    public static <T> T nonNull(T o) {
        if (o == null) throw new NullPointerException();
        //кинуть NPE если null
        return o;
    }

    public static<T> List<T> joinWild(List<? extends T> list, List<? extends T> list2) {
        List<T> result = new ArrayList<>();
        result.addAll(list);
        result.addAll(list2);
        return result;
    }
    // возможно List<? super T> list - это наоборот


    public static List<E> join(List<E> list, List<E> list2) {
        list.addAll(list2);
        return list;
    }

    public static<T> void addAll(List<T> source, List<T> destination) {
        destination.addAll(source);
    }


    public static <E extends Comparable<E>> E max(List<E> list) {
        E max = list.get(0);
        for (E i : list) {
            if (i.compareTo(max) > 0) { //для такого в объявлении надо указать, что Е реализует Comp : E extends Comparable
                //для избежания ошибок класКастЭксепшн надо E extends Comparable<E>
                max = i;
            }
        }
        return null;
//Возможны записи :  <E extends Comparable<E> & Runnable>
    }

    public static <E> E max2(List<E> list, Comparator<E> comparator) {
        E max = list.get(0);
        for (E i : list) {
            if (comparator.compare(i, max) > 0) { //возможно использовать компаратор
                max = i;
            }
        }
        return null;
    }

    //правило PECS Produser - extends, Concumer - super
    //Produser(исп дженерик в качестве возвращаемого значения)
    //Concumer (исп дженерик  в качестве параметра)
}
