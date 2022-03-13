
package stack;

public class StackUsingArray {
	private int data[];
	private int topIndex;
	
	public StackUsingArray() {
		data = new int[10];
		topIndex = -1;
	}
	
	public boolean isEmpty() {
		if(topIndex == -1) {
			return true;
		}
		return false;	
	}
	
	public void push(int ele) throws StackFullException {
		if(topIndex == data.length-1) {
//			StackFullException e = new StackFullException();
//				throw e;
			throw new StackFullException();
		}
		data[topIndex+1] = ele;
		
	}
	
	public int top() throws StackEmptyException {
		if(topIndex == -1) {
			StackEmptyException e = new StackEmptyException();
				throw e;
			
		}
		return data[topIndex];
		
	}

	
	public int pop() throws StackEmptyException {
		if(topIndex == -1) {
			throw new StackEmptyException();
		}
		int temp = data[topIndex];
		topIndex--;
		return temp;
	}
	
	
	public int size() {
		
		return topIndex+1;
		
	}
	
	
	
}
