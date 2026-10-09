package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
    	Random rand = new Random();
    	String[] strings = new String[5];
    	strings[0] = "hello";
    	strings[1] = "nLaerodo";
    	strings[2] = "sanEo";
    	strings[3] = "noCyrne";
    	strings[4] = "aoNay";
    	int smallest = 101;
    	int largest = 0;
    	
        // 2. print the third element in the array
    	System.out.println(strings[2]);
        // 3. set the third element to a different value
    	strings[2] = "f2ubf";
        // 4. print the third element again
    	System.out.println(strings[2]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
    	for(int i = 0; i < 5; i++) {
    		strings[i] = "whaSn";
    	}
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
    	for(int i = 0; i <= strings.length;i++) {
    		
    	}
        // 7. make an array of 50 integers
    	int[] ints = new int[50];
        // 8. use a for loop to make every value of the integer array a random
        //    number
    	for(int i = 0; i <= 50; i++) {
    		int random = rand.nextInt(100);
    		ints[i] = random;
    	}
        // 9. without printing the entire array, print only the smallest number
        //    on the array
    	for(int i = 0; i<= 50; i++) {
    		if(ints[i] <smallest) {
    			smallest = ints[i];
    		}
    		else if(ints[i] > largest) {
    			largest = ints[i];
    		}
    	}
        // 10 print the entire array to see if step 8 was correct
    	for(int i = 0; i<= 50; i++) {
    		System.out.println(ints[i]);
    	}
        // 11. print the largest number in the array.
    	System.out.println("largest: " + largest);
        // 12. print only the last element in the array
    	System.out.println("smallest: " + smallest);
    }
}
