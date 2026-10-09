package _01_Simple_Array_Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.
	
	
	public static void burp(String[] args) {
		printAll(stwing);
	}

	static Random rand = new Random();
	static String[] stwing = new String[10];{
	
	stwing[0] = "burps";
	stwing[1] = "pizza";
	stwing[2] = "leo nardo";
	stwing[3] = "connery";
	stwing[4] = "naoya";
	stwing[5] = "emmy";
	stwing[6] = "eason";
	stwing[7] = "frog ari";
	stwing[8] = "dylan";
	stwing[9] = "denson";}
    //2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static void printAll(String[] arr) {
		for(int i = 0; i <= arr.length; i++) {
			System.out.println(arr[i]);
		}
	}


    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.
	public static void printReverse(String[] arr) {
		int i = 0;
		for(int j = arr.length; j>= 0; j--) {
			arr[i] = arr[j];
			i++;
		}
	}


    //4. Write a method that takes an array of Strings and prints every other String in the array.
	public static void printOther(String[] arr) {
		for(int i = 0; i <= arr.length; i++) {
			if(i%2 == 0) {
				System.out.println(arr[i]);
			}
		}
	}

    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.
	public static void printRandom(String[] arr) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
		String[] strings = new String[arr.length];
		for(int i = 0; i <= arr.length; i++) {
			int rands = rand.nextInt(list.size());
			strings[i] = list.get(rands);
			list.remove(rands);
		}
	}
	

}
