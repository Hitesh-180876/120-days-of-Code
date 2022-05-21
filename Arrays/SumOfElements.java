
package arraypackage;

public class SumOfElements {
	public static void main(String[] args) {
		int arr[] = {1, 2, 6, 6, 7, 8};
		
		int sum = 0;
		int i = arr.length;
		while(i>0) {
			sum+=arr[i-1];
			i--;
		}
		System.out.println(sum);
		int sum1 =0;
		
		for(int a=0; a<arr.length; a++) {
			sum1+=arr[a];
		}
		System.out.println(sum1);
	}
	

}
