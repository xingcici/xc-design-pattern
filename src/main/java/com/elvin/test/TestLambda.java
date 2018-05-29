package com.elvin.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author : Haifeng Pang.
 * @version 0.1 : TestLambda v0.1 2018/5/28 09:59 By Haifeng Pang.
 * @description :
 */
public class TestLambda {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "2", "3", "5","123123","1213");

        list.sort(((o1, o2) -> (Integer.valueOf(o2) - Integer.valueOf(o1))));

        System.out.println(list);
    }
}
