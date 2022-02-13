package arrays;

public class IncreasingTripletSubsequence {
	public static boolean increaseSub(int[] arr) {
		int i = Integer.MAX_VALUE; int j= Integer.MAX_VALUE;
		
		for(int in=0; in<arr.length; in++) {
			if(arr[in]<= i) {
				i = arr[in];
				                                            
			}
			else if(arr[in]<=j) {
				j = arr[in];
			}
			
			else {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 0, 0, 3};
		boolean ans = increaseSub(arr);
		System.out.print(ans);
	}

}
