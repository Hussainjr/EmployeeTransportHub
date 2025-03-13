package com.crm.crm.p4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAny {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("john","jack","jill");
        Optional<String> anyName = names.stream().findAny();
        System.out.println(anyName);

    }
}
