
package loops;

public class Pattern4 {
	public static void main(String[] args) {
		
		int i=1;
		while(i<5) {
			int j=1;
			while(j<=i) {
				char output = (char)('A'+i-1);
				System.out.print(output+" ");
				j+=1;
			}
			i+=1;
			System.out.println();
		}
	}

}
