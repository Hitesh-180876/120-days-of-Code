package linkedList;
import java.util.ArrayList;

public class ArrayListImplementation {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(20);
		arr.add(1, 30);
		arr.add(2, 40);
		Integer o = 10;
		arr.add(o);
		
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		for(int i: arr) {
			System.out.println(i);
		}
		
		System.out.println(arr.size());
	}

}
