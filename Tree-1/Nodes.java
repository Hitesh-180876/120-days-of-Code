
public static int Nodes(Node root) {
		if(root == null) {
			return 0;
		}
		return 1+Nodes(root.left)+Nodes(root.right);
	}
