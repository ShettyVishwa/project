package a_b5;

import java.util.Scanner;

public class ReverseNumberAndPalindromeNumber {
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int x = s.nextInt();
		int temp=x;
		int rem=0;
		int rev=0;
		while(x!=0) {
			rem=x%10;
			rev=rev*10+rem;
			x=x/10;
		}
		System.out.println("The Reversed Number is :"+rev);
		if(rev==temp) {
			System.out.println(temp+" is palindrome number");
		} else {
			System.out.println(temp+" is not palindrome number");
		}
	}
}
