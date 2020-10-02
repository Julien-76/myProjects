import java.util.Scanner;
import java.io.IOException;
public class main {

	public static void main(String[] args) throws IOException {

float prob;
String balance;
int intProb, thune, tickets, gain = 0, pognon = 0, stab=0;
System.out.println("Combien de tickets veux-tu acheter? (3€)");
Scanner sc = new Scanner(System.in);
tickets = sc.nextInt();
thune = 3*tickets;
System.out.println("Ok, " + tickets + " tickets, ça fait " + thune + "€");
System.in.read();
System.out.println("Voici le résultat du premier ticket.");
System.in.read();
do
{
prob = (float)Math.random();
prob = 1250000*prob;
intProb = (int)prob;
intProb++;
if (intProb == 1)
	System.out.println("WIN FOR LIFE ! ! ! !");
else if ((intProb > 1) && (intProb <=21))
{
System.out.println("Le ticket est gagnant !!");
System.in.read();
gain = 2500;
System.out.println("Tu gagnes " + gain + "€");
	}
else if ((intProb > 21) && (intProb <=76))
{
System.out.println("Le ticket est gagnant !!");
System.in.read();
gain = 250;
System.out.println("Tu gagnes " + gain + "€");
	}
else if ((intProb > 76) && (intProb <=201))
{
System.out.println("Le ticket est gagnant !!");
System.in.read();
gain = 100;
System.out.println("Tu gagnes " + gain + "€");
	}
else if ((intProb > 201) && (intProb <=426))
{
System.out.println("Le ticket est gagnant !!");
System.in.read();
gain = 50;
System.out.println("Tu gagnes " + gain + "€");
	}
else if ((intProb > 426) && (intProb <=676))
{
System.out.println("Le ticket est gagnant !!");
System.in.read();
gain = 30;
System.out.println("Tu gagnes " + gain + "€");
	}
else if ((intProb > 676) && (intProb <=2326))
{
System.out.println("Le ticket est gagnant !!");
System.in.read();
gain = 15;
System.out.println("Tu gagnes " + gain + "€");
	}
else if ((intProb > 2326) && (intProb <=27326))
{
System.out.println("Le ticket est gagnant !!");
System.in.read();
gain = 9;
System.out.println("Tu gagnes " + gain + "€");
	}
else if ((intProb > 27326) && (intProb <=153326))
{
System.out.println("Le ticket est gagnant !!");
System.in.read();
gain = 6;
System.out.println("Tu gagnes " + gain + "€");
	}
else if ((intProb > 153326) && (intProb <=321326))
{
System.out.println("Le ticket est gagnant !!");
System.in.read();
gain = 3;
System.out.println("Tu gagnes " + gain + "€");
	}
else
	{
	System.out.println("Le ticket est perdant...");
	gain = 0;
	}
pognon = pognon + gain;
System.in.read();
tickets--;
if (tickets > 0)
	System.out.println("Voici le résultat du ticket suivant");
else System.out.println("Tu n'as plus de tickets");
	System.in.read();
	}while (tickets >0);
System.out.println("Total des gains : " + pognon + "€");
System.in.read();
if ((thune - pognon) > 0)
	balance = "perdu";
else
	balance = "gagné";
pognon = pognon - thune;
if (pognon < 0)
	{
	stab = (0 - pognon);
	pognon = pognon + (2*stab);
	}
else System.out.println("");
System.out.println("Résultat total : tu as " + balance + " " + pognon + "€");
System.out.println("");

}

}
