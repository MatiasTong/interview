package com.mt.section1;

public class Practice4_MergeSortedArrays {
    public static void main(String[] args) {
        int[] myArray = new int[]{1, 2, 6, 10, 11, 15, 20, 21};
        int[] alicesArray = new int[]{1, 2, 8, 12, 14, };

       for(int i: mergeSort(myArray, alicesArray)){
           System.out.println(i);
       }
    }

    public static int[] mergeSort(int[] array1, int[] array2){
        int arrayIndex = 0;
        int arrayIndex1 = 0;
        int arrayIndex2 = 0;
        int[] mergedArray = new int[array1.length + array2.length];

        while( arrayIndex < mergedArray.length){
           if(array1.length == arrayIndex1){
               mergedArray[arrayIndex] = array2[arrayIndex2];
               arrayIndex2+=1;
               arrayIndex+=1;
           } else if(array2.length == arrayIndex2){
                mergedArray[arrayIndex] = array1[arrayIndex1];
                arrayIndex1+=1;
                arrayIndex+=1;
            }else if(array1[arrayIndex1]<array2[arrayIndex2]){
                mergedArray[arrayIndex] = array1[arrayIndex1];
                arrayIndex1+=1;
                arrayIndex+=1;
            }else if(array1[arrayIndex1]>array2[arrayIndex2]){
                mergedArray[arrayIndex] = array2[arrayIndex2];
                arrayIndex2+=1;
                arrayIndex+=1;
            } else{
                mergedArray[arrayIndex] = array1[arrayIndex1];
                arrayIndex+=1;
               arrayIndex1+=1;
                mergedArray[arrayIndex] = array2[arrayIndex2];
                arrayIndex+=1;
               arrayIndex2+=1;
            }

        }
        return mergedArray;
    }
}
