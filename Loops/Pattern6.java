
package loops;

public class Pattern6 {
	public static void main(String[] hitesh) {
		int j=4;
		while(j>0) {
			int i=4;
			while(i>=j) {
				char output=(char)('A'+j-1);
				System.out.print(output);
				i--;
				
			}
			j--;
			System.out.println();
		}
	}

}
