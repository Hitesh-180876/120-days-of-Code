public static int largestNode(Node root) {
		if(root == null) {
			return -1;
		}
		int leftLargest = largestNode(root.left);
		
		int rightLargest = largestNode(root.right);
		
		return Math.max(root.data, Math.max(leftLargest, rightLargest));
	}
