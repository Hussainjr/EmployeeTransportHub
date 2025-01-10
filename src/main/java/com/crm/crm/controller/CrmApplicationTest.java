package com.crm.crm.controller;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CrmApplicationTest {

    @BeforeEach
    public void beforeTest(){
        System.out.println("before test");
    }


    @Test
    public void test1(){
        System.out.println("i am test1");
    }

    @Test
    public void test2(){
        System.out.println("i am test2");
    }



    @AfterEach
    public void afterTest(){
        System.out.println("after test");
    }


}