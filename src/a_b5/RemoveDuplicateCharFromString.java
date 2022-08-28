package a_b5;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateCharFromString {
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = s.nextLine();
		Set<Character> set=new LinkedHashSet<>();
		for(int i=0;i<=str.length()-1;i++) {
			set.add(str.charAt(i));
		}
		for(Character c:set) {
			System.out.print(c);
		}
	}
}
