package arrays;

public class WaveArray {
	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 3, 4, 5};
		
		int i =0;
		while(i <arr.length-1) {
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
			
			i = i+2;
		}
		
		for(int j=0; j<arr.length; j++) {
			System.out.print(arr[j]+" ");
		}
	}

}
