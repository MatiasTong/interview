package com.mt.section2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Practice2_Inflight_entertainment {
    public static void main (String[] args){
        ArrayList<Integer> moviesLength = new ArrayList(Arrays.asList(50, 60, 70));
        int flightLength = 140;
        System.out.println(findMovies(moviesLength, flightLength));

    }

    public static Boolean findMovies(ArrayList<Integer> moviesLengths, int flightLength){
        HashSet<Integer> set = new HashSet<>();

        for(Integer movie:moviesLengths){
            Integer searchValue = flightLength - movie;
            if(set.contains(searchValue)){
                return true;
            }
            set.add(movie);
        }
        return false;
    }

}
