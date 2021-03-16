/**
 * @author - Owen Senowitz
 * A class that test the 2 recursion methods deleteFirst and deleteAll
 */
package assg4_senowitzo19;

import java.util.Scanner;

public class RecursionTest {
	
	/**
	 * method that removes the first occurrence of that letter and returns the letters left
	 * @param str the string we want to take letters out of
	 * @param ch the letter we want to remove
	 * @return output which is our string with out the first character letter
	 */
	public static String deleteFirst(String str, char ch) {
		if(str.equals("")) {
			return str;
		} 
		else {
			if(str.charAt(0) == ch) {
				return str.substring(1);
			}
			else {
				return str.charAt(0) + deleteFirst(str.substring(1), ch);
			}
		}
	}
	/**
	 * method that removes the all occurrences of that letter and returns the letters left
	 * @param str the string we want to take letters out of
	 * @param ch the letter we want to remove
	 * @return output which is our string with out the letters
	 */
	public static String deleteAll(String str, char ch) {
		if(str.equals("")) {
			return str;
		} 
		else {
			if(str.charAt(0) == ch) {
				return deleteAll(str.substring(1), ch);
			}
			else {
				return str.charAt(0) + deleteAll(str.substring(1), ch);
			}
		}
	}
	/**
	 * test the recursive methods with a ui that you can pick with method you want
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str = "Hello Testing";
		char ch = 'l';
		
		Scanner console = new Scanner(System.in);

		System.out.println("1. Test deleteFirst method");
		System.out.println("2. Test deleteAll method");
		System.out.println("3. Exit");
		
		int number = console.nextInt();
		
		if (number == 1) {
			System.out.println(deleteFirst(str, ch));
		}
		if (number == 2) {
			System.out.println(deleteAll(str, ch));
		}
		if (number == 3) {
			System.out.println("exiting");
			System.exit(0);
		}
		console.close();
	}
}
