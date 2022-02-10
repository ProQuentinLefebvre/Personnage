package Personnage;

public class Personnage {
	//public String honte_nom;
	// les attributs
	private String nom;
	private int vie;

	// le constructeur
	public Personnage(String name, int life) {
		//this.nom = name;
		this.setNom(name);
		this.vie = life;
	}

	// accesseur
	public String leNom() {
		return this.nom;
	}

	// accesseur
	public String getNom() {
		return nom;
	}

	// mutateur
	public void setNom(String nom) {
		if(nom.length()>15)
			nom = nom.substring(0, 15);
		this.nom = nom;
	}

	public int laVie() {
		return this.vie;
	}

	public void setVie(int vie) {
		this.vie=vie;
	}

	public boolean degat(int nb){
		//setVie(laVie()-nb);
		setVie(this.vie-nb);
		if(laVie()>0)
			return true;
		return false;
	}

	public int attack(){
		return 10;
	}
	public int attack(int pt){
		return pt;
	}

}
