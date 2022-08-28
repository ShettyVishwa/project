package a_b5;

public class RemoveAndSortElements {
    public static void main(String[] args) {
		int[] arr= {75,42,48,10,94,99,45,42,73,75,61,35,10,56,94,99,56,48};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Array After Sorting----------------------");
		for(int z:arr) {
			System.out.println(z);
		}
		
		int[] temp=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j]=arr[i];
				j++;
			}
		}
		temp[j]=arr[arr.length-1];
		System.out.println("Sorted Array After Removeing Duplicate Elements------------------");
		for(int k=0;k<j+1;k++) {
			System.out.println(temp[k]);
		}
	}
}
