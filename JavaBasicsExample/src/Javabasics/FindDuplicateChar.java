package Javabasics;

public class FindDuplicateChar {

	
		public static void main(String[] args) {
			  String str1 = "w3resource";
			  System.out.println("The given string is: " + str1);
			  System.out.println("After removing duplicates characters the new string is: " + removeDuplicateChars(str1));
			 }
		
		
			 private static String removeDuplicateChars(String sourceStr) {
			  char[] arr1 = sourceStr.toCharArray();
			  String targetStr = "";
			  for (char value: arr1) {
			   if (targetStr.indexOf(value) == -1) {
			    targetStr += value;
			   }
			  }
			  return targetStr;
			 }
			 
			}

//Second method
/*
char[] chars = str.toCharArray();
StringBuilder sb = new StringBuilder();
boolean repeatedChar;
for (int i = 0; i < chars.length; i++) {
    repeatedChar = false;
    for (int j = i + 1; j < chars.length; j++) {
        if (chars[i] == chars[j]) {
            repeatedChar = true;
            break;
        }
    }
    if (!repeatedChar) {
        sb.append(chars[i]);
    }
}
 */