package linkedList1;

import java.util.Scanner;

public class AppendListNToFirst { 
	public static Node appendLastToFirst(Node head, int pos) {
		if(head == null) {
			return head;
		}
		Node h1 = head;
		Node temp = head;
		
		int currPos = 0;
		while(temp!=null && currPos < (pos-1)) {
			temp = temp.next;
			pos++;
		}
		
		Node temp1 = temp.next;
		Node h2 = temp1;
		temp.next = null;
		
		while(temp1!=null && currPos < (pos-1)) {
			temp1= temp1.next;
			pos++;
		}
		
		temp1.next = h1;
		
		return h2;
		
		
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
		Node head = takeInput();
		Node Head = appendLastToFirst(head, 3);
		printLL(Head);
	}

}
