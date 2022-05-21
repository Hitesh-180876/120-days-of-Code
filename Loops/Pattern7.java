
package loops;

public class Pattern7 {
	public static void main(String[] hitesh) {
		int i=1;
		
		while(i<=4) {
			int j=1;
			char output = (char)('A'+4-i);
			while(j<=i) {
				System.out.print(output);
				j+=1;
				output+=1;
			}
			i++;
			System.out.println();
		}
		
		
	}
}
