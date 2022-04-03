/*

For a given a singly linked list of integers and a position 'i', print the node data at the 'i-th' position.

*/

public static int printIthNode(Node head, int ith) {
		int count = 0;
		while(head != null) {
			if(count == ith) {
				return head.data;
			}
			count++;
			head = head.next;
		}
		return Integer.MIN_VALUE;
		
	}
