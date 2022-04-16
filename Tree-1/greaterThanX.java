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
