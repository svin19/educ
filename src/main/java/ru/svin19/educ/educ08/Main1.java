package ru.svin19.educ.educ08;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Main1 {
    public static void main(String[] args) {
//        SimpleCollection<Integer> collection = new SimpleCollectionImpl<>();
//        Integer max1 = CollectionUtils.max(asList(1,2,3,4,5));
        List<String> listS1= new ArrayList<>(asList("sfsadf","asfsadsad","adsfsadfas"));
        List<String> listS2= new ArrayList<>(asList("sfsadf1","asfsadsad1","adsfsadfas1"));

        List<Integer> listI1= new ArrayList<>(asList(1,4,5,6,3));
        List<Integer> listI2= new ArrayList<>(asList(12,34,56,43,23));

        List<String> listS3=CollectionUtils.join(listS1,listS2);
        List<Object> listI3=CollectionUtils.joinWild(listI1,listI2);
        for (Integer s : listI3
             ) {
            System.out.println(s);
        }
    }
}
