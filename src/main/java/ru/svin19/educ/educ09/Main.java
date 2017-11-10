package ru.svin19.educ.educ09;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    //    /*класслодеры - классы, экземпляры которых загружают другие  классы
//    есть стандартные класслодеры
//
//    Bootstrap - класслодер (написаный на C) загружает классы JDK
//    Extention почти не исп
//    System/aplication загружает из classpath
//
//    java.net.URLClassloader
//        пути передаются в конструкторе
//
//    Initiating класслодер который начал загрузку
//    Defining красслодер, загрузивший класс
//
//
//    * */
    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException {
//        URL[] urls = {new URL("file://C:/Users/chupacabra/IdeaProjects/rudukhanoveduc/cls")};
//        List<ClassLoader> list = new ArrayList<>();
//
//        for (int i = 0; i < 1_000_000; i++) {
//            URLClassLoader loader = new URLClassLoader(urls);
//            Class<?> clazz = loader.loadClass("Person");
//            list.add(loader);
//        }

        AlgoStrategyClassLoader ascl = new AlgoStrategyClassLoader("c:Strategies");
        Class<?> clasz = ascl.loadClass("ru.svin19.educ.educ09.Person");
        System.out.println(clasz.getName());
    }

}
