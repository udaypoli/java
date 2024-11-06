package inheritance;

public class Main {
		public static void main(String[] args) {
			Computer c= new Laptop(6);
			c.ram();
		}
}
class Computer{
	void ram() {
		System.out.println("Ram 2 gb");
	}
	void processor() {
		System.out.println("7th gen");
	}
}
class Laptop extends Computer{
	int ram;
	Laptop(int ram){
		this.ram=ram;
	}
	void ram() {
		System.out.println(ram+ "gb");
	}
}
