package com.crm.crm.p4;

import java.util.Arrays;
import java.util.List;

public class AnyMatch {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("john","jack","jane","jill","mike");
        boolean hasJName = names.stream()
                .anyMatch(name->name.startsWith("m"));

        System.out.println(hasJName);


    }
}
