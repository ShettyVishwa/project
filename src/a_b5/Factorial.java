package a_b5;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		long x = s.nextInt();
		long temp=1;
		for(int i=1;i<=x;i++) {
			temp=temp*i;
		}
		System.out.println(temp+" is factorial of "+x);
	}
}
