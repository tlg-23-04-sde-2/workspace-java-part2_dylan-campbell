package com.entertainment.client;

import com.entertainment.Television;

public class TelevisionClient {
    public static void main(String[] args) {
        Television tv1 = new Television();
        Television tv2 = new Television("RCA", 10);
        System.out.println(tv1);
        System.out.println(tv2);

        tv2.changeChannel(9);
        System.out.println(tv2);

        Television tv3 = new Television("Sony", 50);
        Television tv4 = new Television("Sony", 50);
        System.out.println(tv3 == tv4);
        System.out.println(tv3.equals(tv4));
    }
}