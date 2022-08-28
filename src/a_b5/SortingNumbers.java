package a_b5;

public class SortingNumbers {
    public static void main(String[] args) {
		int[] arr= {45,75,63,15,98,42,99,73,19,43,46,82,30,4,76,84,25,94,7,20};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int z:arr) {
			System.out.println(z);
		}
	}
	
	
}
