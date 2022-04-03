package linkedList;
import java.util.ArrayList;

public class ArrayListImplementation {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(20);
		arr.add(1, 30);
		arr.add(2, 40);
		System.out.println(arr.size());
	}

}

