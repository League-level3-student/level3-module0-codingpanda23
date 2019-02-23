package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
			String[] purples = {"mauve","lavender","plum","sangria","periwinkle"};
		//2. print the third element in the array
			System.out.println(purples[2]);
		//3. set the third element to a different value
			purples[2]="iris";
		//4. print the third element again
			System.out.println(purples[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
			for (int i = 0; i < purples.length; i++) {
				String shades = purples[i];
			}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
			for (int i = 0; i < purples.length; i++) {
				System.out.println(purples[i]);
			}
		//7. make an array of 50 integers
				int[] ints = new int[50];
		//8. use a for loop to make every value of the integer array a random number
				Random r = new Random();
				for (int i = 0; i < ints.length; i++) {
					ints[i] = r.nextInt(51);
				}
				
		//9. without printing the entire array, print only the smallest number in the array
				int small = 51;
				for (int i = 0; i < ints.length; i++) {
					if (small > ints[i]) {
						small = ints[i];
					}
				}
				System.out.println(small);
		//10 print the entire array to see if step 8 was correct
				for (int i = 0; i < ints.length; i++) {
					System.out.println(ints[i]);
				}
		//11. print the largest number in the array.
				int large = 51;
				for (int i = 0; i < ints.length; i++) {
					if (large < ints[i]) {
						large = ints[i];
					}
				}
				System.out.println(large);
				
		//12. print only the last element in the array
				System.out.println(ints[ints.length-1]);
	}
}
