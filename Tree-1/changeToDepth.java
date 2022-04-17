
public static void changeToDepth(Node  root, int level) {
		if(root == null) {
			return;
		}
		
		root.data = level;
		
		changeToDepth(root.left,  level+1);
		changeToDepth(root.right, level+1);
		
		
	}
