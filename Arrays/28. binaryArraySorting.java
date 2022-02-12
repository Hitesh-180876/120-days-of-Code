
package arrays;

public class removeDuplicates {
	public static void main(String[] args) {
		int[] arr = new int[] {1, 0, 0, 1, 0, 1};
		int n =6;
		int setZero = 0;
		for(int i=0; i< arr.length; i++){
		    if(arr[i] == 0){                 // swap each zero with the current 1
		        int temp = arr[i];          
		        arr[i]=arr[setZero];                 
		        arr[setZero]=temp;
		        setZero++;
		    }
		 
		 }
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		
	}
	}

}
