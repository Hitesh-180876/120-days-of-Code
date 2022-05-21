
package loops;

public class Pattern4 {
	public static void main(String[] Hitesh) {
		int i=1;
		while(i<5) {
			int p=i;
			int j=1;
			while(j<5) {
				char output = (char)('A'+p-1);
				System.out.print(output);
				j+=1;
				p+=1;
				
			}
			i+=1;
			System.out.println();
		}
	}

}
