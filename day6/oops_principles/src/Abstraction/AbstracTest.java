package Abstraction;

public class AbstracTest {

	public static void main(String[] args) {
	
			Animal a= new Animal() {
				
				@Override
				public void roar() {
					System.out.println("ror...");
					
				}
			};
			a.roar();
			
		
	}
}
