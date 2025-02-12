package tp3exosYaip66;

public abstract class Dog extends animal{

	public Dog (String name) {
		super (name);
	}
	
	public void greets() {
		System.out.println("Wooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooof");
	}
	
	public void greets(Dog another) {
		System.out.println("It's moi le chien woof woof");
	}
}
