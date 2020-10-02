import java.util.Scanner;
public class main {
	public static void main(String[] args) {
String mot;
char reponse;
int nbrLettres;
Scanner sc = new Scanner(System.in);
	System.out.println("Quel sera le mot à deviner ?");
	mot = sc.nextLine();
	nbrLettres = mot.length();		
	char prenom[] = new char[nbrLettres];
	char pendu[] = new char[nbrLettres];
	for(int a = 0; a < nbrLettres; a++)
	{pendu[a] = '_';      // initialisation du pendu en _ _ _ _ _
	}
	for(int r = 0; r < nbrLettres; r++)
	{prenom[r] = mot.charAt(r); // initialisation de la réponse du pendu
	}
	do {
	char carach = ' ';
	int t = prenom.length;
	System.out.println("Tape une lettre en minuscule");
	carach = sc.nextLine().charAt(0);
	for(int i = 0; i < t ; i++)
		{if (carach == prenom[i])
			{pendu[i] = prenom[i];
			}
			else;}
	System.out.println("");
	System.out.println(pendu);
		String penduChar = new String(pendu);
		String prenomChar = new String(prenom);
		if (prenomChar.equals(penduChar))
			System.out.println("Vous avez gagné !!!");
	do {
		System.out.println("Voulez-vous continuer O/N?");
		reponse = sc.nextLine().charAt(0);
		}while(reponse != 'O' && reponse != 'N');
			}while(reponse == 'O');
	System.out.println("Ah ben tchuss alors !!");
}
}
