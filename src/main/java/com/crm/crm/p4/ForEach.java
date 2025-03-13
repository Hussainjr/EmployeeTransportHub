package com.crm.crm.p4;

import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("john","jane","jack","jill");
        names.stream().forEach(System.out::println);

    }
}
