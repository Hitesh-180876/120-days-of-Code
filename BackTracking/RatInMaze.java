package backtracking;


/* Moving directions - top, left, down, right */

public class RatInMaze {
	public static int[][] pathExist(int[][] maze) {
		int n = maze.length;
		int[][] refrenceMaze = new int[n][n];
		
			
		pathExistHelper(maze, refrenceMaze, 0, 0);
		return refrenceMaze;
	}
	
	public static boolean pathExistHelper(int[][] maze, int[][] refrenceMaze,int i,int j) {
		int n = maze.length;
		
		if(i<0 || i>=n || j<0 || j>=n || maze[i][j] == 0 || refrenceMaze[i][j] == 1) {
			return false;
		}
		
		refrenceMaze[i][j] = 1;
		if(i == n-1  && j == n-1) {
			return true;
		}
		
		if(pathExistHelper(maze, refrenceMaze, i-1, j)) { // checking for top
			return true;
		}
		
		if(pathExistHelper(maze, refrenceMaze, i, j+1)) { // checking for right
			return true;
		}
		
		if(pathExistHelper(maze, refrenceMaze, i+1, j)) {  // checking for down
			return true;
		}
		
		if(pathExistHelper(maze, refrenceMaze, i, j-1)) { // checking for down
			return true;
		}
		return false;
	}
	public static void main(String[] args){
		int maze[][] = {{1, 1, 0, 1}, {1, 1, 0, 0}, {1, 0, 0, 0}, {1, 1, 1, 1}};
		
		int path[][] = pathExist(maze);
		//boolean isExist = pathExist(maze);
		//System.out.println(isExist);
		for(int i=0; i<path.length; i++) {
			for(int j=0; j<path.length; j++) {
				System.out.print(path[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}

