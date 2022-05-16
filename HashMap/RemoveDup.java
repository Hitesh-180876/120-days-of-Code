/* remove Duplicate elements from array using HashMap
	Time Complexity : O(N)
	Space Complexity : O(N)

*/



package hashMap;
import java.util.HashMap;
import java.util.ArrayList;

public class RemoveDup {
	public static ArrayList<Integer> uniqueEle(int[] arr){
		ArrayList<Integer> output = new ArrayList<>();
		HashMap<Integer, Boolean> map = new HashMap<>();
		
		for(int i =0; i<arr.length; i++) {
			if(map.containsKey(arr[i])) {
				continue;
			}
			output.add(arr[i]);
			map.put(arr[i], true);
		}
		
		return output;
		
	}
	public static void main(String[] args) {
		int arr[] = {1, 2, 4, 1, 2, 3, 4};
		ArrayList<Integer> output = uniqueEle(arr);
		System.out.println(output);
		
	}

}
