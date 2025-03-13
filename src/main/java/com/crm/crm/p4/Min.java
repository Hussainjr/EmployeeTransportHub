package com.crm.crm.p4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Min {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(0,1,2,3,4);
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        System.out.println(min);

    }
}
