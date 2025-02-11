package exercice3;

import java.util.Random;

public class Velo {
	 private static double default_braquet = 13.0;
	 private double braquet;
	 private double diamRoue;
	 private Random genAlea;
	 
	public double getDefault_braquet() {
		return default_braquet;
	}
	public void setDefault_braquet(double default_braquet) {
		this.default_braquet = default_braquet;
	}
	
	public Velo(double braquet, double diamRoue) {
		this.braquet = braquet;
		this.diamRoue = diamRoue;
		
	}
		
	public Velo(double braquet) {
		this.braquet = braquet;
	
	}
	
	public Velo() {
		super();
	}
	
	public double getBraquet() {
		return braquet;
	}
	public void setBraquet(double braquet) {
		this.braquet = braquet;
	}
	public double getDiamRoue() {
		return diamRoue;
	}
	public void setDiamRoue(double diamRoue) {
		this.diamRoue = diamRoue;
	}
	public Random getGenAlea() {
		return genAlea;
	}
	public void setGenAlea(Random genAlea) {
		this.genAlea = genAlea;
	} 

	public String toString() {
		return "Velo [ braquet=" + braquet + ", diamRoue=" + diamRoue + "]";
	}
	
	public double getPuissance(double FrequenceCoupDePedale) {
		return FrequenceCoupDePedale*braquet*diamRoue*genAlea.nextDouble();
	}
	
	public static void main (String[] args) {
	    Velo v1 = new Velo();
	    Velo v2 = new Velo(4, 5);
	    System.out.println("Le velo a une puissance de" + v1 );
	    System.out.println("Le velo a une puissance de" + v2 );
	    }
	}

