package day4;

public class Variables {

	//access_specifier allocation_type DataType = data;
	public static int i=5;
	public static void main(String[] args) {
		System.out.println(i);
		Variables v1= new Variables();
		Variables v2= new Variables();
		v1.i=15;
		System.out.println(v2.i);
	}
}
