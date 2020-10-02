import java.util.Scanner;
import java.io.IOException;
public class main {

	public static void main(String[] args) throws IOException {
int b1, b2, b3, b4, b5, e1, e2, n1, n2, n3, n4, n5, mE1, mE2, boules = 0, etoiles = 0;
int tirage[] = new int [5];
int mesNumeros[] = new int [5];
double gain = 0;
String numero, stars;
b1 = 1 + ((int)(45*(float)Math.random()));
do	{
	b2 = 1 + ((int)(45*(float)Math.random()));
	}while (b1 == b2);
do	{
	b3 = 1 + ((int)(45*(float)Math.random()));
	}while (b3 == b2 || b3 == b1);
do	{
	b4 = 1 + ((int)(45*(float)Math.random()));
	}while (b4 == b3 || b4 == b2 || b4 == b1);
do	{
	b5= 1 + ((int)(45*(float)Math.random()));
	}while (b5 == b4 || b5 == b3 || b5 == b2 || b5 == b1);
e1 = 1 + ((int)(12*(float)Math.random()));
do	{
	e2 = 1 + ((int)(12*(float)Math.random()));
	}while (e1 == e2);
tirage[0] = b1;
tirage[1] = b2;		
tirage[2] = b3;
tirage[3] = b4;
tirage[4] = b5;
System.out.println("Choisis 5 numéros entre 1 et 45");
Scanner sc = new Scanner(System.in);
n1 = sc.nextInt();
n2 = sc.nextInt();
n3 = sc.nextInt();
n4 = sc.nextInt();
n5 = sc.nextInt();
mesNumeros[0] = n1;
mesNumeros[1] = n2;
mesNumeros[2] = n3;
mesNumeros[3] = n4;
mesNumeros[4] = n5;
System.out.println("Maintenant choisis 2 étoiles (1 - 12 )");
mE1 = sc.nextInt();
mE2 = sc.nextInt();
for ( int k = 0 ; k < 5 ; k++)
	{
	for (int l = 0 ; l < 5 ; l++)
		if (mesNumeros[k] == tirage[l])
			boules++;
	}
if (boules > 1)
	numero = " numéros";
else
	numero = "numéro";
System.out.println("Voici le tirage :");
for (int i = 0 ; i < 5; i++)
	{
	if (i != 4)
		System.out.print(tirage[i] + " ");
	else
		System.out.println(tirage[i]);
	}
System.in.read();
System.out.println("Voici les 2 étoiles : " + e1 + " " + e2);
System.in.read();
if (mE1 == e1)
	etoiles++;
	else if (mE1 == e2)
		etoiles++;
		else if (mE2 == e1)
			etoiles++;
			else if (mE2 == e2)
				etoiles++;
if (etoiles > 1)
	stars = "étoiles";
else
	stars = "étoile";
System.in.read();
System.out.println("tu as " + boules + " " + numero + " et " + etoiles + " " + stars);
System.in.read();
if (boules == 2 && etoiles == 0)
	gain = 3.9;
if (boules == 2 && etoiles == 1)
	gain = 7.1;
if (boules == 1 && etoiles == 2)
	gain = 9;
if (boules == 3 && etoiles == 0)
	gain = 10.5;
if (boules == 3 && etoiles == 1)
	gain = 12.7;
if (boules == 2 && etoiles == 2)
	gain = 16.8;
if (boules == 4 && etoiles == 0)
	gain = 93;
if (boules == 3 && etoiles == 2)
	gain = 50.23;
if (boules == 4 && etoiles == 1)
	gain = 146;
if (boules == 4 && etoiles == 2)
	gain = 2740;
if (boules == 5 && etoiles == 0)
	gain = 27990;
if (boules == 5 && etoiles == 1)
	gain = 270280;
if (boules == 5 && etoiles == 2)
	gain = 73520446;
System.out.println("Tu empoches " + gain + "€");



	}

}
