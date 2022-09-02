package stack;

public class StackUsingArray {
	//push
	//pop
	//top
	//isEmpty
	//size
	
	private int data[];
	private int topIndex;
	
	public StackUsingArray(int n) {
		data = new int[n];
		topIndex = -1;
	}
	
	public int size() {
		return topIndex+1;

	}
	
	public boolean isEmpty() {
		return (topIndex == -1) ? true : false; //ternary operator is ?
	}
	
	public int top() {
		if(topIndex == -1) {
			return 0;
		}
		else {
			return data[topIndex];
		}
	}
	
	public void push(int ele) throws StackFullException {
		if(topIndex != data.length-1) {
			data[++topIndex] = ele;
		}
		else {
			throw new StackFullException();
		}
	}
	
	public int pop() throws StackEmptyException {
		if(topIndex != -1) {
			int temp = data[topIndex];
			topIndex--;
			return temp;
		}
		throw new StackEmptyException();
	}
	

}
