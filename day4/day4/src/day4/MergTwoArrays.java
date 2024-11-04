package day4;

import java.util.Arrays;

public class MergTwoArrays {

	public static void main(String[] args) {
		String a[]= {"chai","coffee"};
		String b[]= {"milk","water"};
		String c[]= new String[a.length+b.length];
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		System.out.println(Arrays.toString(c));
	}
}
