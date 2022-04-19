
// program to mirror the binary Tree using java 


package tree2;
import java.util.Scanner;
public class TreeInput {
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
	}

}
