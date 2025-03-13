package com.crm.crm.p4;

import java.util.Arrays;
import java.util.List;

public class Reduce {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
        Integer result = numbers.stream().reduce(0, Integer::sum);
        System.out.println(result);

    }
}
