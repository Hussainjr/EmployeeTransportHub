package com.crm.crm.p4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Limit {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("john","jane","jack");
        List<String> limitedNames = names.stream()
                .limit(2).collect(Collectors.toList());
        System.out.println(limitedNames);

    }
}
