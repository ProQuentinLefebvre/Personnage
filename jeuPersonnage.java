import Personnage.Personnage;

public class jeuPersonnage {
    public static void main(String[] args) throws Exception {
      
        Personnage UnSorcier = new Personnage("Quentin", 200);
        Personnage Unhumain = new Personnage("Jacques", 200);
        System.out.println("le personnage est -->" + UnSorcier.leNom());
        System.out.println("le personnage est -->" + Unhumain.leNom());
    
		System.out.println("Le sorcier " + UnSorcier.leNom() + " se balade dans la forêt sombre tranquillement");
		System.out.println("D'un coup un humain nommé " + Unhumain.leNom() + " interpel " + UnSorcier.leNom() );
		System.out.println("Etant que " +  Unhumain.leNom() + " parle très mal au sorcier, il décide d'attaquer l'humain avec une boule de feu" );
		System.out.println(Unhumain.leNom() + " s'exprima en disant : je suis en vie : "+UnSorcier.attack(40) + Unhumain.degat(UnSorcier.attack(40)) + " j'ai " + Unhumain.laVie() + " point de vie"); 
		System.out.println(Unhumain.leNom() + " se mit en colère et frappe " + UnSorcier.leNom() + Unhumain.attack(10) + UnSorcier.degat(Unhumain.attack(10)));
		System.out.println(UnSorcier.leNom() + " rigole et dit : tu me fais aucun dégats, il me reste " + UnSorcier.laVie());
		System.out.println(UnSorcier.leNom() + " Je vais te battre en un coup " + UnSorcier.leNom() + " attaque avec un éclair " + Unhumain.leNom());
		System.out.println(Unhumain.leNom() + " s'exprime en disant : il est trop fort.. " + UnSorcier.attack(160) + Unhumain.degat(UnSorcier.attack(160)) );
		System.out.println(Unhumain.leNom() + " Meurt parce qu'il n'a plus que " + Unhumain.laVie());

        

    }
}
