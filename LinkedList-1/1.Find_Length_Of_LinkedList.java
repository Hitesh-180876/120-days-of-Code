/*

For a given singly linked list of integers, find and return its length. Do it using an iterative method

*/



public static int lengthLL(Node head) {
		int count = 0;
		while(head != null) {
			count++;
			head = head.next;
		}
		return count;
	}
