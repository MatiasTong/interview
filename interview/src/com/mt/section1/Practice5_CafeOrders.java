package com.mt.section1;

public class Practice5_CafeOrders {
    public static void main(String[] args) {
        int[] takeOut = new int[]{1, 2};
        int[] dineIn = new int[]{3};
        int[] servedOrders = new int[]{2, 3, 1};

        boolean isOrdered = true;
        int takeOutIndex = 0;
        int dineInIndex =0;

        for (int i = 0; i < servedOrders.length; i++) {
            if(takeOutIndex<takeOut.length && servedOrders[i] == takeOut[takeOutIndex]){
                takeOutIndex++;
            }
            if(dineInIndex<dineIn.length && servedOrders[i] == dineIn[dineInIndex]){
                dineInIndex++;
            }
        }
        if(takeOutIndex!=takeOut.length || dineInIndex!=dineIn.length){
            isOrdered = false;
        }
        System.out.println(isOrdered);
    }
}
