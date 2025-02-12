package tp3exosYaip66;

public class BigDog extends Dog{
	
	
	public BigDog (String name) {
		super (name);
	}
	
	public void greets() {
		System.out.println("Wooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooow");
	}
	
	public void greets(Dog another) {
		System.out.println("Grrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
	}
	
	public void greets(BigDog another) {
		System.out.println("It's moi le evil chien woof woof");
	}
}
