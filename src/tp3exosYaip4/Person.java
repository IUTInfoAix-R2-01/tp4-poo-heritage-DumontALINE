package tp3exosYaip4;

public class Person {
	private String name; 
	private String adresse;
	
	
	public Person (String name, String adresse) {
		this.name = name;
		this.adresse = adresse;
	}


	public String getName() {
		return name;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public String toString() {
		return "Person[name ="+ name +", adresse =" + adresse + "]";
	}
	
}
