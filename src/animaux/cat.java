package animaux;

public class cat extends mammal {

	public cat (String name) {
		super(name);
	}
	
	public void greets () {
		System.out.println("Meow");
	}
	
	public String toString() {
		return "cat[mammal[animal[name =]]]";
	}
}
