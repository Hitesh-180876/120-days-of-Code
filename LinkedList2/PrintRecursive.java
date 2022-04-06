
package linkedList2;
import linkedList1.Node;

import java.util.Scanner;
public class printRecursiveLL {
	
	public static void printRecursiveLL(Node head) {
		if(head == null) {
			return;
		}
		System.out.println(head.data);
		
		printRecursiveLL(head.next);
	}
	
	
	public static Node takeInput() {
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		
		Node head= null ; 
		Node tail = null;
		
		
		while(data != -1) {
			Node currNode = new Node(data);
			
			if(head == null) {
				head = currNode;
				tail = currNode;
			}else {
				tail.next = currNode;
				tail = currNode;
			}
			data = sc.nextInt();
		}
		sc.close();
			
		return head;
		
	}
	public static void main(String[] args) {
		Node head = takeInput();
		printRecursiveLL(head);
		
	}
	

}
