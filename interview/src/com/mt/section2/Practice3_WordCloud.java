package com.mt.section2;

import java.util.ArrayList;
import java.util.HashMap;

public class Practice3_WordCloud {
    public static void main(String[] args) {
        String sentence1 = "Add  milk and eggs, then add flour and sugar, apple cat";
        String sentence2 = "After beating the eggs, Dana read the next step";
        countWords(sentence1);
    }

    public static HashMap<String, Integer> countWords(String sentence) {
        //Rid sentence of end whitespaces and make lowercase
        String lowerCaseSentence = sentence.toLowerCase().trim();
//        System.out.println(lowerCaseSentence);

        HashMap<String, Integer> wordMap = new HashMap<>();
        String word = "";
        for (int i = 0; i < lowerCaseSentence.length(); i++) {
            char letter = lowerCaseSentence.charAt(i);

            if (!Character.isAlphabetic(letter) && word.length()>0) {
                if (wordMap.containsKey(word)) {
                    int value = wordMap.get(word);
                    wordMap.put(word, value + 1);

                } else {
                    wordMap.put(word, 1);
                }
                word = "";
            } else {
                if (Character.isAlphabetic(letter)) {
                    word += letter;
                }
            }
        }
        wordMap.forEach((key, value) -> System.out.println(key + " : " + value));
        return wordMap;
    }

    public static HashMap<String, Integer> countOccurrances(ArrayList<String> wordList) {
        HashMap<String, Integer> wordMap = new HashMap<>();
        for (String word : wordList) {
            String key = word;
            if (wordMap.containsKey(key)) {
                int value = wordMap.get(key);
                wordMap.put(key, value + 1);
            } else {
                wordMap.put(key, 1);
            }
        }
        wordMap.forEach((key, value) -> System.out.println(key + " : " + value));
        return wordMap;

    }

}
