package day4;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		int[] arr= {3243,55,4,22,4,54,3,0};
		int [] b= new int[arr.length];
		System.out.println(arr);
		System.arraycopy(arr, 0, b, 0, arr.length);
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(b));
	}
}
