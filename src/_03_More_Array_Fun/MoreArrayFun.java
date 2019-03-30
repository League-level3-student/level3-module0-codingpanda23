package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {

	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		// printStrings();
		// reverseStrings();
		// everyOther();
		// randomOrder();
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	public static void printStrings() {
		String stuff[] = { "one", "two", "three", "four", "five" };
		for (int i = 0; i < stuff.length; i++) {
			System.out.println(stuff[i]);
		}

	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array in reverse order.
	public static void reverseStrings() {
		String stuff[] = { "one", "two", "three", "four", "five" };
		for (int i = 4; i < stuff.length; i--) {
			System.out.println(stuff[i]);
		}
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	public static void everyOther() {
		String stuff[] = { "one", "two", "three", "four", "five" };
		for (int i = 0; i < stuff.length; i += 2) {
			System.out.println(stuff[i]);
		}
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array in a completely random order. Almost every run of the program
	// should result in a different order.
	public static void randomOrder() {
		String stuff[] = { "one", "two", "three", "four", "five" };
		Random rand = new Random();
		for (int i = 0; i < stuff.length; i++) {
			int r = rand.nextInt(5);
			System.out.println(stuff[r]);
		}
	}

}
