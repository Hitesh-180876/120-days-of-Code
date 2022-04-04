
package linkedList1;

import java.util.Scanner;
public class InsertNodeLL {
	
	public static Node insertNodeLL(Node head, int pos, int data) {
		Node currNode = new Node(data);
		
		if(pos == 0) {
			currNode.next = head;
			head = currNode;
			return head;
		}
		
		if(head == null) {
			return head;
		}
		
		int prev = 0;
		while(head != null && prev < pos-1) {
			head = head.next;
			prev+=1;
		}
		
		currNode.next = head.next;
		head.next = currNode;
		
		return head;
		
	}
	public static void printLL(Node head) {
		while(head != null) {
			System.out.print(head.data + "->");
			head = head.next;
		}
		System.out.println("null");
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
		Node Head = insertNodeLL(head, 2, 10);
		
		printLL(Head);
	//	insertNodeLL(head, 2, 10);
	}

}

