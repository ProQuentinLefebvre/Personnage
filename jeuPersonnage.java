import Personnage.*;

	public class jeuPersonnage {
		public static void main (String args[]) {
			Personnage UnSorcier = new Personnage ("Quentin", 200);
			System.out.println("infos sur le Personnage" + UnSorcier.leNom());

			Personnage Unhumain = new Personnage ("Jacques", 200);
			System.out.println("le personnage est -->" + Unhumain.leNom());
			}
}			
