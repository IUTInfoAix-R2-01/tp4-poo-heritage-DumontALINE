package animaux;

public class dog extends mammal {

	public dog (String name) {
		super(name);
	}
	
	public void greets () {
		System.out.println("Woof");
	}
	
	public void greets (dog another) {
		System.out.println("Woooooooooooooof");
	}
	
	public String toString() {
		return "cat[mammal[animal[name =]]]";
	}
}