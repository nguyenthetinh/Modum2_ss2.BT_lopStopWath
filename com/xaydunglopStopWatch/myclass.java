package com.xaydunglopStopWatch;

import java.util.Arrays;

public class myclass {
    public static void main(String[] args) {
        StopWatch stopWatch=new StopWatch();
        long []mang= new long[1000000];
        for (int i=0; i<mang.length ; i++){
           mang[i]= Math.round(Math.random()*1000000);
        }
        stopWatch.start();
        Arrays.sort(mang);
        stopWatch.stop();
        System.out.println("thoi gian sap sep mang = "+stopWatch.getElapsedTime());
    }
}
