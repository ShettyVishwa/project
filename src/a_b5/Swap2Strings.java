package a_b5;

public class Swap2Strings {
    public static void main(String[] args) {
    	//with using 3rd variable
		String s1="love";
		String s2="hate";
		String s3=s1;
		s1=s2;
		s2=s3;
		System.out.println(s1);
		System.out.println(s2);
		
		//without using 3rd variable
		
		String a="you";
		String b="here";
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println(a);
		System.out.println(b);
	}
}
