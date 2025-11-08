package exceptionHandling;

import java.util.*;

public class sorting {

	public static void main(String[] args) {
		
		        int[] intArray = {5, 2, 8, 1, 9};
		        System.out.println("Original int array: " + Arrays.toString(intArray));

		        Arrays.sort(intArray); 
		        System.out.println("Sorted int array: " + Arrays.toString(intArray));
		       
		        ArrayList<Integer> integerList = new ArrayList<>();
		        integerList.add(7);
		        integerList.add(4);
		        integerList.add(10);
		        integerList.add(3);

		        System.out.println("\nOriginal Integer List: " + integerList);

		        Collections.sort(integerList); 
		        System.out.println("Sorted Integer List: " + integerList);
		    }
		}
