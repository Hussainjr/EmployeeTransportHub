package com.crm.crm.p4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Skip {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("john","jack","jane","mike");
        List<String> skippedNames = names.stream().skip(1).collect(Collectors.toList());
        System.out.println(skippedNames);


    }
}
