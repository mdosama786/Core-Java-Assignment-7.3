
/**@Program to find a substring in a String 
 *without using an inbuilt method of String class*/

/**@Import scanner*/
import java.util.Scanner;

/** @Define class */

public class FindSubstring {
	/** @Main method */
	public static void main(String[] args) {
		/** @Uounter initializing to 0 */
		int flag = 0;
		/** @User entering the string in s */
		System.out.println("Enter the string");
		Scanner o = new Scanner(System.in);
		String s = o.nextLine();
		/** @User entering sub string to check in s1 */
		System.out.println("Enter the sub string you want to find");

		String s1 = o.nextLine();
		/** @Outer loop */
		for (int i = 0; i < s.length(); i++) {
			/** @Inner loop */
			for (int j = 0; j < s1.length(); j++) {
				/** @Catching character at specified index */
				if (s.charAt(i + j) == s1.charAt(j)) {
					/** @Match till sub string size */
					if (j == s1.length() - 1) {
						/** @Show found String */
						System.out.println("String found");
						/** @Increase counter if condition matched */
						flag++;
						break;
					}
				} else {

					break;
				}
			}
		}
		/**
		 * @if counter remains zero above condition not matched so print not
		 *     found
		 */
		if (flag == 0)
			System.out.println("String not found");
	}
}