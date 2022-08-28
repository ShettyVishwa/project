package a_b5;

import java.util.Scanner;

public class ReverseStringAndPalindromeString {
   public static void main(String[] args) {
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the String :");
	  String str = s.nextLine();
	  String rev="";
	  for(int i=str.length()-1;i>=0;i--) {
		  rev=rev+str.charAt(i);
	  }
	  System.out.println("The Reversed String is :"+rev);
	  if(rev.equalsIgnoreCase(str)) {
		  System.out.println(str+" is palindrome string");
	  } else {
	      System.out.println(str+" is not palindrome string");
	  }
}
}
