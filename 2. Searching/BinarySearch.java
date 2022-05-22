
package searchingAndSorting;

public class BinarySearch {
	public static int binarySearch(int arr[], int x) {
		int left = arr[0];
		int right = arr[arr.length-1];
		
		while(left<=right) {
			int mid = left+(right-left)/2;
			
			if(arr[mid] > x) {
				right=mid-1;
			}
			
			else if(arr[mid]<x) {
				left = mid+1;
			}
			
			else return mid;
			
		}
		return -1;
		
	}
	public static void main(String[] hitesh) {
		int arr[] = {1, 2, 3, 4, 5, 6, 8};
		int a = 5;
		int bs = binarySearch(arr, a);
		System.out.println(bs);
	}

}
