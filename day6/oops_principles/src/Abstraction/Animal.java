package Abstraction;

public interface Animal {
		void roar();
}

class Dog implements Animal{

	@Override
	public void roar() {
		System.out.println("dog shouts");
		
	}
	
}
class Cat implements Animal{

	@Override
	public void roar() {
		System.out.println("Cat roaring ");
		
	}
	
}
