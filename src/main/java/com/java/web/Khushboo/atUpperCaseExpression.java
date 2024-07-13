package com.java.web.Khushboo;

public class atUpperCaseExpression {
	 public static void main(String[] args) {
	        String str = "hello";
	        String upperCaseStr = "";

	        for (int i = 0; i < str.length(); i++) {
	            upperCaseStr += str.substring(i, i + 1).toUpperCase();
	        }

	        System.out.println(upperCaseStr); // Prints "HELLO"
	    }
	
}
	 
