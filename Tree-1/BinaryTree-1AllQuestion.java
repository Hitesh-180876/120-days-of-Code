package tree;

import java.util.Scanner;

public class TreeInput {
	
	public static void changeToDepth(Node  root, int level) {
		if(root == null) {
			return;
		}
		
		root.data = level;
		
		changeToDepth(root.left,  level+1);
		changeToDepth(root.right, level+1);
		
		
	}
	public static void printAtDepthK(Node root, int k) {
		if(root == null) {
			return;
		}
		if(k == 0) {
			System.out.println(root.data);
		}
		printAtDepthK(root.left, k-1);
		printAtDepthK(root.right, k-1);
	}
	public static int leafNodes(Node root) {
		if(root == null) {
			return 0;
		}
		if(root.left == null && root.right == null) {
			return 1;
		}
		
		return leafNodes(root.left)+ leafNodes(root.right);
	}
	public static int greaterThanX(Node root, int x) {
		if(root == null) {
			return 0;
		}
		int count = root.data>x ? 1:0;
		
		if(root.left!=null) {
			count+= greaterThanX(root.left, x);
		}
		
		if(root.right !=null) {
			count+=greaterThanX(root.right, x);
		}
		
		return count;
		
	}
	public static int height(Node root) {
		if(root == null) {
			return 0;
		}
		return 1 + Math.max(height(root.left), height(root.right));
	}
	public static int largestNode(Node root) {
		if(root == null) {
			return -1;
		}
		int leftLargest = largestNode(root.left);
		
		int rightLargest = largestNode(root.right);
		
		return Math.max(root.data, Math.max(leftLargest, rightLargest));
	}
	public static int Nodes(Node root) {
		if(root == null) {
			return 0;
		}
		return 1+Nodes(root.left)+Nodes(root.right);
	}
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
		
		printAtDepthK(root, 4);
		int treeHeight =  height(root);
		int numLeaf = leafNodes(root);
		System.out.println(numLeaf);
		
		int greaterNodes = greaterThanX(root, 5);
		System.out.println(greaterNodes);
		
		System.out.println(treeHeight);
		
		int numNodes = Nodes(root);
		int largest = largestNode(root);
		System.out.println(largest);
		System.out.println(numNodes);
		
		changeToDepth(root, 0);
		printTree(root);
	}
}
