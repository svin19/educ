package ru.svin19.educ.educ08;

import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.List;

//дженерики
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(); // <Integer> можно заменить на <>
        list.add(1111);

        Integer integer = list.get(0);

        //List list = new ArrayList();
        //так было в 4 java, в 5 стало List<Integer>
    }
}
