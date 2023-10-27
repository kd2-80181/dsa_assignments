import java.util.Arrays;

public class Insertion {
	public static void insertionSort(int arr[] , int n) {
		
		for(int i=1; i<n ; i++) {
			int temp = arr[i];
			int j= i-1;
			
			while(j>= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
				
				arr[j + 1] = temp;
			}
		}
		
		
	}

	
	public static void main(String[] args) {
		int arr[] = {33, 22, 66, 55, 44, 11 , 77 , 88};
		System.out.println("before sorting =" + Arrays.toString(arr));
		insertionSort(arr , arr.length);
		System.out.println("after sorting =" + Arrays.toString(arr));
	}
}
