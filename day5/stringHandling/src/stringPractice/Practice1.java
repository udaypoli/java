package stringPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		String s="hello world";
		String a[]=s.split(" ");
		ArrayList<StringBuffer> al= new ArrayList<StringBuffer>();
		StringBuffer sb= new StringBuffer();
		for (String string : a) {
			
			sb.append(string);
			sb.reverse();
			al.add(sb);
			sb.setLength(0);
		}
		StringBuffer[] s1=  al.toArray(new StringBuffer[0]);
		System.out.println(Arrays.toString(s1));
		
		
			
				
	}
}
