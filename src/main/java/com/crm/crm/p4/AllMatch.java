package com.crm.crm.p4;

import java.util.Arrays;
import java.util.List;

public class AllMatch {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("john","jack","jill");
        boolean allJName = names.stream()
                .allMatch(name -> name.startsWith("j"));

        System.out.println(allJName);

    }
}
