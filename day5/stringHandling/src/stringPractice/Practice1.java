package stringPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Practice1 {
	
	boolean alphabates(char ch){
		var count=0;
		if (ch>='A'&&ch<='Z'&&ch>='a'&&ch<='z') {
			return true;
		}
		return false;
	}
	
	boolean numbers(char ch){
		var count=0;
		if (ch>='0'&&ch<='9') {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println("Enter data ");
		Scanner scan = new Scanner(System.in);
		String data=scan.nextLine();
		
		var alpha=0;
		var numb=0;
		var sym=0;
		var c=' ';
		for (int i = 0; i < data.length(); i++) {
			c=data.charAt(i);
			if (Character.isAlphabetic(c)) {
				alpha++;
			}
			else if (Character.isDigit(c)) {
				numb++;
			}
			else {
				sym++;
			}
		}
		System.out.println("alphas : "+alpha);
		System.out.println("numbs : "+numb);
		System.out.println("syms : "+sym);
		
				
	}

	
}
