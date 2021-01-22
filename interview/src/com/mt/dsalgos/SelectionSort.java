package com.mt.dsalgos;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {2, -10, 5, 4, -20, 2};
        //-10, 2, 5, 4
        //-10, 2, 5, 4
        //-10, 2, 4, 5


        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        for (int num : array) {
            System.out.println(num);
        }
    }


    public static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
