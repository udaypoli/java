package day4;

public class AvgOfIntegerArray {

	public static void main(String[] args) {
		int[] a= {2,5,3,9,6};
		var sum=0;
		for (int i : a) {
			sum+=i;
		}
		System.out.println(sum/a.length);
	}
}
