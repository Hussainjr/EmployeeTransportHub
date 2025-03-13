package com.crm.crm.p4;

import java.util.*;
import java.util.stream.Stream;

public class stream {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("john","jack","jio");
        Stream<String> stream = names.stream();
        stream.forEach(System.out::println);
    }
}
