package com.crm.crm.p4;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {

       List<List<String>> names = Arrays.asList(
               Arrays.asList("john","jane"),
               Arrays.asList("jack","jill"));
       List<String> flatNames = names.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(flatNames);
    }
}
