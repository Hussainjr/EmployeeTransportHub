package com.crm.crm.p4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,1,2,3,4,4,5);
        List<Integer> newList = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(newList);


    }
}
