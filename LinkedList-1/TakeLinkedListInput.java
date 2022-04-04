package linkedList1;

public class Node {
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
	}

}


/* NEW CLASS */
package linkedList1;

import java.util.Scanner;

public class LinkedListInput {
	public static void printLL(Node head) {
		while(head != null) {
			System.out.print(head.data+"->");
			head = head.next;
		}
	}
	public static Node takeInput() {
		Scanner sc = new Scanner(System.in);
		
		Node head = null, tail = null;
		int data = sc.nextInt();
		
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
		printLL(head);
		
	}
	
}
