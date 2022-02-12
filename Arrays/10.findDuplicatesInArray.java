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
