import java.util.Scanner;

public class main {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int lignes, etoiles, etoilesTemp, espaces, espacesTemp, pied;
System.out.println("Combien de lignes doit faire le sapin? ");
lignes = sc.nextInt();
espaces = (lignes - 1);
etoiles = 1;
do
	{espacesTemp = espaces;
	etoilesTemp = etoiles;
for(espacesTemp = espaces; espacesTemp > 0; espacesTemp--)
	{
	System.out.print(" ");}
for(etoilesTemp = etoiles; etoilesTemp > 0; etoilesTemp--)
	{
	if (etoilesTemp > 1)
	System.out.print("*");
	else
	System.out.println("*");
	}
	espaces--;
	etoiles = etoiles + 2;
	}while(espaces >= 0);
for(pied = lignes; pied > 1; pied--)
	{System.out.print(" ");}
System.out.print("*");
	}
}
