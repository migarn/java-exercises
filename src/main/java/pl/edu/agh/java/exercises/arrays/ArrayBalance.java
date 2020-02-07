package pl.edu.agh.java.exercises.arrays;

import java.util.Arrays;

/**
 * Given an array, return true if there is a place to split the array so that
 * the sum of the numbers on one side is equal to the sum of the numbers on the
 * other side.
 * 
 * Dla zadanej tablicy zwróć true, jeśli da się tak rozmieścić jej elementy, że
 * suma jej elementów w lewej i w prawej połowie będzie równa.
 * 
 * @see http://codingbat.com/prob/p158767
 */
public class ArrayBalance {
	public boolean canBalance(int[] array) {
//		throw new UnsupportedOperationException();
		int leftSideSum = 0;
		int arraySum = Arrays.stream(array).sum();
		int rightSideSum = arraySum;
		
//		int[] sortedArray = array.s
		
//		for (int i = 0; i < array.length; i++) {
//			for (int j = i; j < array.length; j++) {
//				leftSideSum += array[j];
//				rightSideSum -= array[j];
//				if (leftSideSum == rightSideSum) {
//					return true;
//				}
//			}
//		}
		
		for (int i = 1; i < array.length;) {
			
			int[] leftSide = new int[i];
			leftSide[0] = array[0];
			leftSideSum = arraySum(leftSide);
			rightSideSum = arraySum - leftSideSum;
			
			if (leftSideSum == rightSideSum) {
				return true;
			}
			
			
			
		}
		
		
		int i = 0;
		
		while (leftSideSum == rightSideSum) {
			leftSideSum += array[i];
			rightSideSum -= array[i];
		}
		
		return true;
	}
	
	private int arraySum(int[] array) {
		return Arrays.stream(array).sum();
	}
}
