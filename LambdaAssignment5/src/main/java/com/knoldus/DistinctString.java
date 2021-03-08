package com.knoldus;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctString {
    public List<String> distinctStr(){
    List<String> ls = Arrays.asList("java" , "scala" , "java" , "clojure" , "clojure");
    List<String> ls1 = ls.stream().distinct().sorted().collect(Collectors.toList());
     return ls1;
    }
}
