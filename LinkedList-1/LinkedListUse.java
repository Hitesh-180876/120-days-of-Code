
package linkedList1;

public class LinkedListUse {
	public static void incrementLL(Node  head) {
		while(head != null) {
			head.data++;
			head = head.next;
		}
	}
	public static Node createLL() {
		Node n1 = new Node(30);
		Node n2 = new Node(40);
		Node n3 = new Node(50);
		n1.next = n2;
		n2.next = n3;
		
		return n1;
		
	}
	public static void main(String[] args) {
		
		Node head = createLL();
		incrementLL(head);
		
		while(head!=null) {
			System.out.print(head.data+"->");
			head = head.next;
		}
		System.out.print("null");
	}

}
