package com.crm.crm.p4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collect {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("john","jane","jack","jill");
        List<String> result = names.stream().collect(Collectors.toList());
        System.out.println(result);
    }
}
