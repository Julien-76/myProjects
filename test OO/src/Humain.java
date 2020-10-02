import java.util.Scanner;

public class Humain {
	

	public String getChat()
	{return nomDuChat;}
	public int getAnniversaire()
	{return anniversaire;}

	int taille, anniversaire;
	String nomDuChat, village;
	public Humain(int pTaille, String pChat, String pVillage, int pNaissance)
	{
	taille = pTaille;
	anniversaire = pNaissance;
	nomDuChat = pChat;
	village = pVillage;
	Scanner test = new Scanner(System.in);
	System.out.println("Nous sommes maintenant dans la classe Humain");
	String teste1 = test.nextLine();
	System.out.println(teste1);
	
	}

}
