
package loops;

public class Pattern3 {
	public static void main(String[] args) {
		
		int i=1;
		while(i<5) {
			int j=1;
			while(j<5) {
				char output = (char)('A'+j-1);
				System.out.print(output+" ");
				j+=1;
			}
			i+=1;
			System.out.println();
		}
	}

}
