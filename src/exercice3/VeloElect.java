package exercice3;

public class VeloElect extends Velo{
	private static double default_facteur_puissance_moteur = 15.0;
	private double facteurPuissanceMoteur;
	
	
	public VeloElect (double braquet, double diamRoue, double coupleMoteur) {
		super(braquet, diamRoue);
		facteurPuissanceMoteur = coupleMoteur;
	}
	
	public VeloElect (double diamRoue, double coupleMoteur) {
		super(diamRoue);
		facteurPuissanceMoteur = coupleMoteur;
	}
	
	public VeloElect () {
		super();
	}

	public static double getDefault_facteur_puissance_moteur() {
		return default_facteur_puissance_moteur;
	}

	public static void setDefault_facteur_puissance_moteur(double default_facteur_puissance_moteur) {
		VeloElect.default_facteur_puissance_moteur = default_facteur_puissance_moteur;
	}

	public double getFacteurPuissanceMoteur() {
		return facteurPuissanceMoteur;
	}

	public void setFacteurPuissanceMoteur(double facteurPuissanceMoteur) {
		this.facteurPuissanceMoteur = facteurPuissanceMoteur;
	}
	
	@Override 
	public String toString() {
		return "VeloElect [ facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]";
	}
	
	@Override
	public double getPuissance(double FrequenceCoupDePedale) {
		return super.getPuissance(FrequenceCoupDePedale) * facteurPuissanceMoteur;
	}
	
	public static void main (String[] args) {
		VeloElect v1 = new VeloElect();
        VeloElect v2 = new VeloElect(4, 5);
        VeloElect v3 = new VeloElect(3, 9, 7);
        System.out.println("Le velo elec a une puissance de" + v1 );
        System.out.println("Le velo elec a une puissance de" + v2 );
        System.out.println("Le velo elec a une puissance de" + v3 );
        }
}

