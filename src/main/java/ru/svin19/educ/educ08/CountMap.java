package ru.svin19.educ.educ08;

public interface CountMap {
    //добавляет элемент в данный контейнер
    void add(Object o);
    //Возвращает количество добавлений данного элемента
    int getCount(Object o);
    //Удаляет элемент из контейнера и возвращает количество его добавлений до удаления
    int remove (Object o);

}
