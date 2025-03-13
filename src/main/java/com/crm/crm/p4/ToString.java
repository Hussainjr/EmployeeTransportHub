package com.crm.crm.p4;

import java.util.Arrays;
import java.util.List;

public class ToString {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("john","jack","jane");
        String[] nameArray = names.stream().toArray(String[]::new);
        System.out.println(Arrays.toString(nameArray));

    }
}
