package ru.svin19.educ.educ05;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.List;

public class StackImpl implements Stack {

    Integer[] values;
    Integer maxSize;
    public StackImpl(Integer maxSize){
        this.maxSize=maxSize;
    }
    public Integer get() {
        if (values[0]==null) {
            throw new NullPointerException("There is empty first elem");
        }
        return values[0];
    }

    public void add(Integer i) {
      if (values.length>=maxSize) {throw new RuntimeException("stack overloaded exception");}
      for(Integer n = maxSize; n>=0;n--){
          values[n+1]=values[n];

      }

    }
}
