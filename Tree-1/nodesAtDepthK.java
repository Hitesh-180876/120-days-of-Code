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
