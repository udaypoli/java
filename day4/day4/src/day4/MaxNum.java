package day4;

import java.util.Arrays;
import java.util.Iterator;

public class MaxNum {

	public static void main(String[] args) {
//		int[] a= {2,5,1,9,6,9};
//		int[] b= new int[a.length];
//		System.arraycopy(a, 0, b, 0, a.length);
//		Arrays.sort(b);
//		var index=-1;
//		for (int i : a) {
//			index++;
//			if (i==b[b.length-1]) {
//				System.out.println(i);
//				System.out.println(index);
//				break;
//			}
//		}
		
		String[] s= {"coffee","water","chai","dietcoke"};
		int min=Integer.MAX_VALUE;
		int i=-1;
		int i1=0;
		String s1="";
		for (String string : s) {
			i++;
			if (string.length()<min) {
				min=string.length();
				s1=string;
				i1=i;
			}
			
		}
		System.out.println(s1);
		System.out.println(i1);
		
		
		
	}
}
