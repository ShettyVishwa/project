package a_b5;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int x = s.nextInt();
		int temp=x;
		int length=0;
		while(temp!=0) {
			temp=temp/10;
			length=length+1;
		}
		int t2=x;
		int rem=0;
		int arm=0;
		while(t2!=0) {
			int mul=1;
			rem=t2%10;
			for(int i=1;i<=length;i++) {
				mul=mul*rem;
			}
			arm=arm+mul;
			t2=t2/10;
		}
		System.out.println(arm);
		if(arm==x) {
			System.out.println(x+" is armstrong number");
		} else {
			System.out.println(x+" is not armstrong number");
		}
	}
}
