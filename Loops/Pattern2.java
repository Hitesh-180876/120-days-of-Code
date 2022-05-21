
package loops;

public class Pattern2 {
	public static void main(String[] args) {
		int i= 1;
		while(i<=5) {
			int j=1;
			int p=i;
			while(j<=i) {
				System.out.print(p);
				p+=1;
				j+=1;
			}
			i+=1;
			System.out.println();
		}
	}
}
