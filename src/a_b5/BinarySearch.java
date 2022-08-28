package a_b5;

import java.util.Scanner;

public class BinarySearch {
   public static void main(String[] args) {
	  int[] arr= {1,4,5,7,9,11,12,14,16,17,18,20,25,30,48,75,99};
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the number:");
	  int x = s.nextInt();
	  int low=0;
	  int high=arr.length-1;
	  int mi=(low+high)/2;
	  while(low<=high){
	  if(arr[mi]==x) {
		  System.out.println(x+" is in the "+mi+" index position");
		  break;
	  } else if(arr[mi]<x) {
		  low=mi+1;
	  } else {
		  high=mi-1;
	  }
	  mi=(low+high)/2;
	  }
	  if(x!=arr[mi]) {
		  System.out.println("The number is not present in Array");
	  }
	  
}
}
