package com.crm.crm;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("mike", "stallin", "mike", "adam");
        List<String> newList = list.stream().filter(t->t.length()>4).collect(Collectors.toList());
        System.out.println(newList);


    }
}
