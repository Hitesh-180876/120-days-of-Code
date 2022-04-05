/*

While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.
Output format :
For each test case/query, return the index/position of 'N' in the singly linked list. Return -1, otherwise.

*/


package linkedList1;


import java.util.Scanner;

public class FindNodeInLL {
	
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
	
	public static int nodeIndex(Node head, int value) {
		int count = 0;
		
		if(head == null) {
			return -1;
		}
		
		while(head != null) {
			if(head.data ==  value) {
				return count;
			}
			head = head.next;
			count++;
		}
		return -1;
		
		
	}
	public static void main(String[] args) {
		Node head = takeInput();
		int index = nodeIndex(head, 50);
		System.out.println(index);
		
	}

}
