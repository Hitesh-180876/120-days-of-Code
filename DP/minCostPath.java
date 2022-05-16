/* Minimum cost path using dynamic programming 
Time Comlexity : O(N)
Space Complexity : O(N)

*/

package arrays;


public class Mincostpath {
	public static int Mincost(int[][] arr) {
		int m = arr.length;
		int n = arr[0].length;
		
		int[][] storage = new int[m][n];
		
		storage[m-1][n-1] = arr[m-1][n-1];
		
		for(int j=n-2; j>=0; j--) {
			storage[m-1][j] = storage[m-1][j+1] + arr[m-1][j];
		}
		
		for(int i=m-2; i>=0; i--) {
			storage[i][n-1] = storage[i+1][n-1] + arr[i][n-1];
		}
		
		
		for(int i=m-2; i>=0; i--) {
			for(int j=n-2; j>=0; j--) {
				storage[i][j] = arr[i][j] + Math.min(storage[i+1][j], storage[i][j+1]);
			}
		}
		
		return storage[0][0];
		
		
	}
	public static void main(String[] args) {
		int arr[][] = {{1, 1, 1}, {4, 5, 2}, {7, 8, 9}};
		int ans = Mincost(arr);
		System.out.println(ans);
	}

}
