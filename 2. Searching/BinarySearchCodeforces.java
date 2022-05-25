
package binarySearch;

import java.util.Scanner;

public class BinarySearchCodeforces {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}


		for(int i=0; i<k; i++) {
			int x = sc.nextInt();

			int left=0;
			int right= arr.length-1;
			boolean ok = false;

			while(left<=right) {
				int mid = (left+right)/2;
				if(arr[mid] == x) {
					ok = true;
					break;
				} else if(arr[mid]>x) {
					right = mid-1;
				}
				else {
					left = mid+1;
				}


			}

			if(ok) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
		
			}

		}
		sc.close();
	}

}
