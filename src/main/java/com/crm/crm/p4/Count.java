package com.crm.crm.p4;

import java.util.Arrays;
import java.util.List;

public class Count {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("john","jack","jill");
        long count = names.stream().count();
        System.out.println(count);


    }
}
