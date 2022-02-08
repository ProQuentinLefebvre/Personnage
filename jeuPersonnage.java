import Personnage.Personnage;

public class jeuPersonnage {
    public static void main(String[] args) throws Exception {
      
        Personnage UnSorcier = new Personnage("Quentin", 200);
        Personnage Unhumain = new Personnage("Jacques", 200);
        System.out.println("le personnage est -->" + UnSorcier.leNom());
        System.out.println("le personnage est -->" + Unhumain.leNom());
    
        System.out.println("infos sur le Personnage ---->" + UnSorcier.leNom());
        System.out.println("Je suis en vie: (attack "+Unhumain.attack()+")" + UnSorcier.degat(Unhumain.attack()) +" j'ai " + UnSorcier.laVie());
        System.out.println("Je suis en vie: (attack "+Unhumain.attack(40)+")" + UnSorcier.degat(Unhumain.attack(40)) +" j'ai " + UnSorcier.laVie());
        if(UnSorcier.laVie()>0)
            System.out.println("ouf je suis en vie");
        else
            System.out.println("argggg");
        

    }
}
