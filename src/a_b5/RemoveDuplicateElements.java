package a_b5;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
		int[] arr= {1,1,2,2,3,3,4,5,6,6,6,7,7,7,8,8,8,9,9,9,9};
		int[] temp=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j]=arr[i];
				j++;
			}
		}
		temp[j]=arr[arr.length-1];
		for(int z=0;z<j+1;z++) {
			System.out.println(temp[z]);
		}
	}
}
