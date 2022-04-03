package linkedList;

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListRemoveConsecutiveDuplicates {
	
	public static ArrayList<Integer> removeDup(int arr[]){
		ArrayList<Integer> array = new ArrayList<>(4);
		
		array.add(arr[0]);
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] != arr[i-1]) {
				array.add(arr[i]);
			}
		}
		
		
		return array;
		
	}
	public static void main(String[] args) {
		int[] arr = {1, 1, 3, 3, 3, 5, 6 , 3};
		ArrayList<Integer> ans = removeDup(arr);
		for(int i:ans) {
			System.out.print(i + " ");
		}
		
		
	}

}
