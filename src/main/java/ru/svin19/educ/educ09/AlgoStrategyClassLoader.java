package ru.svin19.educ.educ09;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class AlgoStrategyClassLoader extends ClassLoader {

    //PAth c:Strategies
    //student
    String nameRoot;
    //alex.ru.sbt.MyAlgoStrategy
    //c:/strategies/alex/ru/sbt/MyAlgoStrtegy.class
    public AlgoStrategyClassLoader(String nameRoot){
        this.nameRoot = nameRoot.replaceAll(":",":/")+"/";
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] v = new byte[0] ;

        try {
            v = Files.readAllBytes(new File(nameRoot+name.replace('.','/')+".class").toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return defineClass(name, v,0,v.length);

    }
}
