package tp3exosYaip4;

public class Staff extends Person{
	private String school;
	private double paye;
	
	public Staff (String name, String adresse, String school, double paye) {
		super(name, adresse);
		this.school = school;
		this.paye = paye;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public double getPaye() {
		return paye;
	}

	public void setPaye(double paye) {
		this.paye = paye;
	}
	
	@Override
	public String toString() {
		return "staff[" + super.toString() + "school=" + school + "paye = " + paye + "]" ; 
	}
	
}
