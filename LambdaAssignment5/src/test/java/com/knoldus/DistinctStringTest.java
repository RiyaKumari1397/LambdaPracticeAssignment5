package com.knoldus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DistinctStringTest {
    DistinctString distinctString = new DistinctString();

    @Test
    void getDistinctString(){
        List<String> test1 = distinctString.distinctStr();
        List<String> list = Arrays.asList("clojure" , "java" , "scala");
        Assertions.assertEquals(list ,test1);
    }

    @Test
    void getNotDistinctString(){
        List<String> test2 = distinctString.distinctStr();
        List<String> list = Arrays.asList("java" , "scala" , "java" , "clojure" , "clojure");
        Assertions.assertNotEquals(list,test2);
    }


}