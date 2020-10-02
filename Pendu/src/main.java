import java.util.Scanner;
public class main {
	public static void main(String[] args) {
String mot;
char reponse;
int nbrLettres;
Scanner sc = new Scanner(System.in);
do {
	System.out.println("Quel sera le mot à deviner ?");

	mot = sc.nextLine();
	nbrLettres = mot.length();		
	char prenom[] = new char[nbrLettres];
	for(int r = 0; r < nbrLettres; r++)
	{prenom[r] = mot.charAt(r);
	}
	char carach = ' ';
	int i = 0, t = prenom.length;
	System.out.println("Tape une lettre en minuscule");
	carach = sc.nextLine().charAt(0);
	while(i < t && carach != prenom[i])
		{i++;}
		if (i >= t)
			System.out.println("La lettre n'est pas dans le mot !");
			else
			System.out.println("La lettre est dans le mot !!");
	do {
		System.out.println("Voulez-vous réessayer O/N?");
		reponse = sc.nextLine().charAt(0);
	}while(reponse != 'O' && reponse != 'N');
}while(reponse == 'O');
	System.out.println("Ah ben tchuss alors !!");
	}
}
