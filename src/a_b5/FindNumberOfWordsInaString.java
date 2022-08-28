package a_b5;

import java.util.Scanner;

public class FindNumberOfWordsInaString {
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = s.nextLine();
		String[] string =str.trim().split(" ");
		System.out.println(string.length);
	}
}
