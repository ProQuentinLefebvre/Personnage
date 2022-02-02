package Personnage;
public class Personnage {
//le constructeur 
public Personnage (String name, int life){
	this.nom = name;
	this.vie = life;
}

//accesseur 
public String leNom() {
 	 return this.nom;
}
public int laVie() {
 	 return this.vie;
}  
//les attributs
private String nom;
private int vie;
}

//mutateur 
public void setnom(String pnom) {
	
}

