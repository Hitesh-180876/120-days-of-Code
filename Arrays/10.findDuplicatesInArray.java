package arrays;

public class DupInArray {
	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 3, 4, 2};
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		
		
		int sum1 = (arr.length * (arr.length-1))/2;
		int ans = sum-sum1;
		System.out.println(ans);
		
		int ans1 = 0;
		for(int i=0; i<arr.length; i++) {
			ans1 = ans1^arr[i];
		}
		for(int i=0; i<=arr.length-1; i++) {
			ans1 = ans1^i;
		}
		System.out.print(ans1);
		
		
	}
}

/* Another solution can be */

package test1;

public class Test {
	public static int sum(int[] arr, int ele) {
		int sum1 = 0;
		for(int i=0; i<arr.length; i++) {
			sum1 = sum1+arr[i];
		}
		int a = sum1-ele;
		
		int n = arr.length;
		int sum = n*(n+1)/2;
		
		int ans = sum - a;
		
		return ans;
		
		
	}
	public static int duplicateEle(int[] arr) {
		int n = arr.length;
		int count[] = new int[n+1];
		
		for(int i=0; i<arr.length; i++) {
			if(count[arr[i]] == 0) {
				count[arr[i]] += 1;
				
			}else {
				return arr[i];
			}
		}
		
		return Integer.MIN_VALUE;
	}
	public static void main(String[] args) {
		/*
		 * String s = "AABBBFFEDA";
		 * 
		 * for(int i=0; i<s.length(); i++) { int count = 1; while(i+1 < s.length() &&
		 * s.charAt(i) == s.charAt(i+1)) { count++; i++; }
		 * System.out.print(s.charAt(i)+""+count); }
		 */
		
		int arr[]  = {1, 2, 3, 4, 4};
		int ele = duplicateEle(arr);
		System.out.println(ele);
		int ans = sum(arr, ele);
		System.out.println(ans);
	}
}

