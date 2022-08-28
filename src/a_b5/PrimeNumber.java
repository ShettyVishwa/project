package a_b5;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int x = s.nextInt();
		int temp=0;
		for(int i=2;i<x;i++) {
			if(x%i==0) {
				temp=temp+1;
			}
		}
		if(temp==0) {
			System.out.println(x+" is prime number");
		} else {
			System.out.println(x+" is not prime number");
		}
	}
}
