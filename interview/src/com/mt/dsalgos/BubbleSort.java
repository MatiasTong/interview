package com.mt.dsalgos;

//O(n^2)
public class BubbleSort {
    public static void main(String[] args){
        int[] array = {20, 35, -15, 7, 33, 1, -22};
//        for(int i=0; i<array.length-1; i++){
//            for(int j=0; j<array.length-1; j++){
//                if ( array[j]>array[j+1]){
//                        int temp = array[j+1];
//                        array[j+1] =array[j];
//                        array[j] = temp;
//                }
//            }
//        }
        boolean isUnsorted;
        do {


            isUnsorted = false;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    isUnsorted = true;
                }
            }
        }while(isUnsorted);

            for(int num: array){
            System.out.println(num);
        }

    }
}

//6354
//3654
//3564
//3546
//3546
//3456
//3456
