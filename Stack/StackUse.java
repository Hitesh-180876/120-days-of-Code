
package stack;

public class StackUse {
	public static void main(String[] args) throws Exception {
		System.out.println("Hello world");
		StackUsingArray s = new StackUsingArray();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
	}

}
