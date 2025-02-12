package tp3exosYaip62;

public abstract class rectangle extends GeometricObject {
	private double wigth;
	private double length;
	
	public rectangle(double wight, double length) {
		this.wigth = wight;
		this.length = length;
	}
	
	public String toString() {
		return "renctangle[wigth =" + wigth + "length" + length +"]";
	}

	public abstract double getArea();
	
	public abstract double getperimeter();
}
