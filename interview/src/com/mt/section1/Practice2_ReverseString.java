package com.mt.section1;


public class Practice2_ReverseString {
    public static void main(String[] args) {
        String string = "I live in NYC";
        System.out.println(reverseString(string));

    }

    public static String reverseString(String input){
        char[] charArray = input.toCharArray();
        int middle = (int)Math.floor(charArray.length/2);
        for(int i=0; i<=middle; i++){
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length-1-i];
            charArray[charArray.length-1-i] = temp;
        }
            String result="";
        for (char c : charArray){
            result += c;
        }
        return(result);
    }

}
