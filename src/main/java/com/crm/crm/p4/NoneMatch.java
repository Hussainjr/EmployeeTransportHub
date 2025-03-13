package com.crm.crm.p4;

import java.util.Arrays;
import java.util.List;

public class NoneMatch {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("john","jill","jane");
        boolean noneMatch = names.stream()
                .noneMatch(n->n.startsWith("j"));

        System.out.println(noneMatch);

    }
}
