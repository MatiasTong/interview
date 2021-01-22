package com.mt.section1;
//Order of conditional statements do matter, i == charArray.length || charArray[i] == ' ' ,
//if the first conditional statement is evaluated to true than the second is ignored

//also be careful with the empty spaces b/c esp with the first and last words,
// it is a good idea to ignore the spaces when reversing each string


public class Practice3_ReverseWords {
    public static void main(String[] args) {
        String input = "subway the to went we";
        System.out.println(reverseWords(input));
    }

    public static String reverseWords(String input) {
        char[] charArray = input.toCharArray();
        reverseString(charArray, 0, charArray.length - 1);

        int lastSpaceIndex = 0;
        for (int i = 0; i <= charArray.length; i++) {
            if (i == charArray.length || charArray[i] == ' ' ) {

                reverseString(charArray, lastSpaceIndex, i-1);
                lastSpaceIndex = i + 1;
            }
        }
        return new String(charArray);
    }



    public static void reverseString(char[] charArray, int leftIndex, int rightIndex) {
//        for (int i = 0; i <= Math.floor((rightIndex-leftIndex) / 2); i++) {
//            char temp = charArray[leftIndex+i];
//            charArray[leftIndex+i] = charArray[rightIndex-i];
//            charArray[rightIndex - i] = temp;
//
//        }

        while (leftIndex < rightIndex){
        char temp = charArray[leftIndex];
        charArray[leftIndex] = charArray[rightIndex];
        charArray[rightIndex] = temp;

        leftIndex++;
        rightIndex--;
    }
        System.out.println(new String(charArray));
}
}

