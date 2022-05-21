
package loops;

public class Pattern1 {
	public static void main(String[] abc) {
		int p=1;
		int i = 0;
		while(i<5) {
			int j=0;
			while(j<=i) {
				System.out.print(p+" ");
				p+=1;
				j+=1;
			}
			i+=1;
			System.out.println();
		}	
	}
}
