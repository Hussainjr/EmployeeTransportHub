package com.crm.crm.p4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("john","jane","jack");
        List<Integer> nameLength = names.stream().map(String::length).collect(Collectors.toList());
        System.out.println(nameLength);
    }
}
