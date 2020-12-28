package com.min.edu;

import java.util.Arrays;
import java.util.Collections;

public class Test2 {
	
	 public static void main(String[] args) {
	      System.out.println(Test2.question2("42893", 3));
	   }
	   
	   public static String question2(String number, int k) {
	        String max = "";
	        Integer[] array = new Integer[number.length()];
	        
	        for (int i = 0; i < number.length(); i++) { // 4 2 8 9 3
	         array[i] = Character.getNumericValue(number.charAt(i));
	      }
	        
	        Arrays.sort(array, Collections.reverseOrder()); // 9 8 4 3 2
	        
	        for (int i = 0; i < number.length()-k; i++) {
	           String temp = Integer.toString(array[i]);
	           max = max+temp;
	        }
	        
	        return max;
	    }


	}
