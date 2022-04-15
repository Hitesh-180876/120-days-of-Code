
package tree;

import java.util.Scanner;

public class TreeInput {
	public static void printTree(Node root) {
		if(root == null) {
			return;
		}
		
		System.out.println(root.data);
		
		if(root.left != null) {
			printTree(root.left);
		}
		if(root.right != null) {
			printTree(root.right);
		}
	}
	
	
	public static Node takeInput() {
		Scanner sc = new Scanner(System.in);
		
		int rootData = sc.nextInt();
		
		if(rootData == -1) {
			return null;
		}
		
		Node root = new Node(rootData);
		
		Node leftNode = takeInput();
		
		Node rightNode = takeInput();
		
		root.left = leftNode;
		root.right = rightNode;
		
		
		
		return root;
		
		
	}
	
	public static void main(String[] args) {
		Node root = takeInput();
		
		printTree(root);
	}
}
