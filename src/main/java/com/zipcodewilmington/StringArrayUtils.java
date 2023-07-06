package com.zipcodewilmington;

import java.util.ArrayList;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(String hold : array){
            if(hold.equals(value)){
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reverse = new String[array.length];
        int position = 0;
        for(int i = array.length-1; i >= 0; i--){
            reverse[position] = array[i];
            position++;
        }
        return reverse;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        boolean palindrome = false;
        for(int i = 0; i < array.length/2; i++){
            if(array[i].equals(array[array.length-1-i])){
                palindrome = true;
            }
            else{
                palindrome = false;
            }
        }
        return palindrome;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String hold = "";
        for(int i = 0; i < array.length; i++){
            hold = hold + array[i];
        }
        hold = hold.toLowerCase();
        int checker = 0;
        for(char letter : alphabet){
            for(int x = 0; x < hold.length(); x++){
                if(hold.charAt(x)== letter){
                    checker++;
                    break;
                }
            }
        }
        if(checker == 26){
            return true;
        }
        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int occurrences = 0;
        for(String hold: array){
            if(hold.equals(value)){
                occurrences++;
            }
        }
        return occurrences;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String hold= "";
        for(String content:array){
            if(!content.equals(valueToRemove)){
                hold = hold + content + " ";
            }
        }
        return hold.split(" ");

    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String hold= "";
        String previous = " ";
        for(String content:array){
            if(!content.equals(previous)){
                hold = hold + content + " ";
            }
            previous = content;
        }
        return hold.split(" ");
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String hold = "";
        for (String item: array){
            hold += item;
        }
        return hold.split("(?<=(.))(?!\\1)");
    }


}
