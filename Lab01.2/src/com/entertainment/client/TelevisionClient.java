package com.entertainment.client;

import com.entertainment.Television;

import java.util.HashSet;
import java.util.Set;

class TelevisionClient {
    public static void main(String[] args) {
        Television tv1 = new Television("Sony", 50);
        Television tv2 = new Television("LG", 52);

        System.out.println(tv1 == tv2);
        System.out.println(tv1.equals(tv2));
        System.out.println();

        System.out.println(tv1.hashCode());
        System.out.println(tv2.hashCode());

        Set<Television> tvs = new HashSet<>();
        tvs.add(tv1);
        tvs.add(tv2); // should be rejected as a duplicate, and size is still 1
        System.out.println("The size of the Set is: " + tvs.size());
    }
}