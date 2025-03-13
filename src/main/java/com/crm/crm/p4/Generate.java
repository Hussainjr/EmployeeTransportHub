package com.crm.crm.p4;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Generate {
    public static void main(String[] args) {

        //the sum of all elements an array
        int[] arr = {1,2,3,1,2,4,5};

        int sum = 0;
        for(int num : arr){
            sum+=num;
        }
        System.out.println("sum: "+sum);

        int sum1 = Arrays.stream(arr).sum();
        System.out.println(sum1);


    }
}
