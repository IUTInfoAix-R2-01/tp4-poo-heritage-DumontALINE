package tp3exosYaip62;

public abstract class Circle extends GeometricObject{
	
	private double Radius;
	
	public Circle(double Radius) {
		this.Radius = Radius;
	}
	
	public String toString() {
		return "Circle[rasius =r]";
	}

	public abstract double getArea();
	
	public abstract double getperimeter();
}
	