package com.crm.crm.p4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Peek {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("john","jane","jack");
        List<String> result = names.stream()
                .peek(System.out::println).collect(Collectors.toList());


    }
}
