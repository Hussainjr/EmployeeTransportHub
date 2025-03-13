package com.crm.crm.p4;

import java.util.*;
import java.util.stream.Collectors;

public class filter {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("john","jane","jack","mike");
        List<String> filteredNames = names.stream().filter(name->name.startsWith("m")).collect(Collectors.toList());
        System.out.println(filteredNames);

    }
}
