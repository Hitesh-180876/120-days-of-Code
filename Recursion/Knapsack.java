
package recursion;

public class Knapsack {
	static int maxWeight(int[] val,  int[] weight, int W, int i) {
		
		if(i == val.length) {
			return 0;
		}
		int ans;
		if(weight[i]<=W) {
			int ans1 = maxWeight(val, weight, W, i+1);
			int ans2 = val[i]+maxWeight(val, weight, W-weight[i], i+1);
			
			ans = Math.max(ans1, ans2);
		}else {
			ans = maxWeight(val, weight, W, i+1);
		}
		
		return ans;
	}
	public static void main(String[] args) {
		int[] val = {60, 100, 120};
		int[] weight = {10, 20, 30};
		int W = 50;
		
		int ans = maxWeight(val, weight, W, 0);
		System.out.print(ans);
	}

}
