package a_b5;

public class FibonaciSeries {
     public static void main(String[] args) {
		int a=0,b=1;
		int c=0;
		for(int i=1;i<=25;i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
}
