import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		char reponse;
		do{
Scanner sc = new Scanner(System.in);
int a,b, nbrLettres, stop;
int juste = 0;
System.out.println("Quel est le mot � analyser ?");
String mot = sc.nextLine();
a = 0;
nbrLettres = mot.length();
b = nbrLettres - 1;
stop = nbrLettres / 2;
for(int test = 0; test < stop; test++)
	{if(mot.charAt(a) == mot.charAt(b))
	{
	juste++;
	a++;
	b--;
	}
	else
		;}
if(juste == stop)
	System.out.println("C'est un palindr�me");
else
	System.out.println("Ce n'est pas un palindr�me");
do{System.out.println("Voulez-vous r�essayer? O/N");
reponse = sc.nextLine().charAt(0);
	}while(reponse!= 'O' && reponse != 'N');
		}while(reponse == 'O');
		System.out.println("Ah que ciao  !");
}
}
