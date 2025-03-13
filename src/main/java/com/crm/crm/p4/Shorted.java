package com.crm.crm.p4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Shorted {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("jane","mike","john");
        List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNames);

    }
}
