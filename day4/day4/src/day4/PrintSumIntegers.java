package day4;

public class PrintSumIntegers {

	public static void main(String[] args) {
		int[] a= {2,5,1,9,6};
		int sum=0;
		for (int i : a) {
			sum+=i;
		}
		System.out.println(sum);
	}
}
