package ru.svin19.educ.educ05;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;


//        Ctrl+Alt+t  - surround with
        try {
            int z = x / y;
        } catch (ArithmeticException e) {
            System.out.println("Hello!");
        } catch (NullPointerException e) {
            System.out.println("Hello!");
        } catch (Exception e) {
            System.out.println("Hello!");
            throw new IOException(); // возможно явно вызывать исключения.
        } finally {
            //этот блок выполняется до отправки exception наверх
            //return в finally всегда срабатывает первым.
            //ловить  Exception - плохая практика - надо знать и указывать какое именно исключение ловится
            /*RuntimeException можно не описывать в сигнатуре метода
            * все остальны едожны быть либо отловлены в методе либо указаны в сигнытуре метода
            * */
        }

        System.out.println(x / y);
        System.out.println("Hello!");


        //Exception - ошибка логики программы
        //Error - ошибка виртуальной машины(память, поиск классов, кончился стэк и т.д.)
        //
        //
        // There is "try with resources"
//        try (FileOutputStream fileOutputStream = new FileOutputStream("File.txt")){
//    }catch (){}
    //  в этом случае очистка ресурсов произойдет автоматически
        // такое возможно для объектов, которые реализуют интерфейс autoClosable

}
