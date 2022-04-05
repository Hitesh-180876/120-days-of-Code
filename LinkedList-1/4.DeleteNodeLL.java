package linkedList1;

import java.util.Scanner;

public class DeleteNodeLL {
	
	public static Node deleteNode(Node head, int pos) {
		int currPos = 0;
		
		if(pos == 0) {
			head = head.next;
			return head;
		}
		Node temp = head;
		
		while(temp != null && currPos < (pos-1)) {
			temp = temp.next;
			currPos++;
			
		}
		if(temp == null || temp.next ==  null) {
			return head;
		}
		
		temp.next = temp.next.next;
		
		return head;
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
	
	public static void printLL(Node head) {
		while(head != null) {
			System.out.print(head.data + "->");
			head = head.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		Node head  = takeInput();
		Node Head = deleteNode(head, 2);
		printLL(Head);
		
	}
}
