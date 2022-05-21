
package loops;

public class PostPreOperators {
	public static void main(String[] hitesh) {
		int i=1;
		int j=1;
		int k=1;
		int l=1;
		System.out.println(i++ +""+ j++); // post increment use old value;
		System.out.println(k-- +""+ l--); // post decrement use old value;
		System.out.println(--i +""+ --j); // pre increment use new value and print the new value after subtracting 1
		System.out.println(++i +""+ ++j); // pre increment use new value and print the new value after adding 1
		
	}

}
