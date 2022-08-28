package a_b5;

import java.util.Scanner;

public class FindCharacterOrOvelsOrBraket {
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = s.nextLine();
		int countA=0;
		int countE=0;
		int countI=0;
		int countO=0;
		int countU=0;
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)=='a') {
				countA++;
			} else if(str.charAt(i)=='e') {
				countE++;
			} else if(str.charAt(i)=='i') {
				countI++;
			} else if(str.charAt(i)=='o') {
				countO++;
			} else if(str.charAt(i)=='u') {
				countU++;
			}
		}
		System.out.println("Number of a's :"+countA);
		System.out.println("Number of e's :"+countE);
		System.out.println("Number of i's :"+countI);
		System.out.println("Number of o's :"+countO);
		System.out.println("Number of u's :"+countU);
	}
}
