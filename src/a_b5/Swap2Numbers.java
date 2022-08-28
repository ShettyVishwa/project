package a_b5;

public class Swap2Numbers {
    public static void main(String[] args) {
    	//using 3rd variable
		int x=10;
		int y=20;
		int temp=x;
		x=y;
		y=temp;
		System.out.println(x);
		System.out.println(y);
		
		//without using 3rd variable
		int j=30;
		int k=40;
		j=j+k;
		k=j-k;
		j=j-k;
		System.out.println(j);
		System.out.println(k);
		
	}
	
	
}
