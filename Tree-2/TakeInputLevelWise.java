package tree2;
import java.util.*;
import java.util.Scanner;
public class TreeInputLevelWise {
	
	public static Node takeInputLevelWise() {
		Scanner sc = new Scanner(System.in);
		
		int rootData = sc.nextInt();
		
		if(rootData == -1) {
			return null;
		}
		
		Node root = new Node(rootData);
		
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		
		while(!queue.isEmpty()){
			Node front = queue.poll();
			int left = sc.nextInt();
			if(left != -1) {
				Node leftChild = new Node(left);
				front.left = leftChild;
				queue.add(leftChild);
			}
			
			int right = sc.nextInt();
			if(right != -1) {
				Node rightChild = new Node(right);
				front.right = rightChild;
				queue.add(rightChild);
			}
		}
		
		return root;
		
		
	}
	public static void mirrorTree(Node root) {
		if(root == null) {
			return;
		}
		mirrorTree(root.left);
		mirrorTree(root.right);
		
		Node temp = root.left;
		root.left = root.right;
		root.right = temp;
		
	}
	public static void printTree(Node root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+" :");
		
		if(root.left != null) {
			System.out.print("L"+root.left.data);
		}
		if(root.right != null) {
			System.out.print("R"+root.right.data);
		}
		System.out.println();
		printTree(root.left);
		printTree(root.right);
	}
	public static Node takeInput() {
			Scanner sc = new Scanner(System.in);
			int rootData = sc.nextInt();
			
			if(rootData == -1) {
				return null;
			}
			Node root = new Node(rootData);
			
			Node left = takeInput();
			Node right = takeInput();
			
			root.left = left;
			root.right = right;
			
			return root;
	}
	public  static void main(String[] args) {
		Node root = takeInput();
		printTree(root);
		mirrorTree(root);
		printTree(root);
		Node root1 = takeInputLevelWise();
		printTree(root1);
	}

}

