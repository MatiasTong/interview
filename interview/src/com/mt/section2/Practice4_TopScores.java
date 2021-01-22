package com.mt.section2;

import java.util.ArrayList;
import java.util.HashMap;

public class Practice4_TopScores {
    public static void main(String[] args){
       int[] unsorted_scores = {37, 89, 41, 65, 91, 53};
       final int HIGHEST_POSSIBLE_SCORE = 100;
       int lowestScore = unsorted_scores[1];

       HashMap <Integer, Integer> map = new HashMap<>();
       for(int num: unsorted_scores){
           if(num< lowestScore){
               lowestScore = num;
           }
           if(map.containsKey(num)){
               map.put(num, map.get(num)+1);
           }else{
               map.put(num, 1);
           }
       }

       ArrayList<Integer> sortedArray = new ArrayList();
       for(int i = lowestScore; i<HIGHEST_POSSIBLE_SCORE; i++){
           if (map.containsKey(i)) {
               for(int j=0; j<sortedArray.get(i); j++)
               sortedArray.add(i);
           }
       }

       System.out.println(sortedArray);

       }
    }

