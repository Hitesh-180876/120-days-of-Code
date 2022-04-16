public static int leafNodes(Node root) {
		if(root == null) {
			return 0;
		}
		if(root.left == null && root.right == null) {
			return 1;
		}
		
		return leafNodes(root.left)+ leafNodes(root.right);
	}
