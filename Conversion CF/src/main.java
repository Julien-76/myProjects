import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// declarations
		Scanner sc = new Scanner(System.in);
		String str;
		int conv, erreur, erreur1; //conv sera le sens de la conversion, erreur servira à sortir de la boucle
		double tempe = 0;
		double tempFin = 0;//tempe sera la température à convertir, tempFin la température convertie
		char choix; // On s'en fout pour le moment
		// TODO Auto-generated method stub
		erreur1 = 1;

	do {
		System.out.println("Choississez le mode de conversion :");
		System.out.println("1 - Conversion Celcius -> Fahrenheit");
		System.out.println("2 - Conversion Fahrenheit -> Celcius");
		conv = sc.nextInt();	// on récupère le choix du sens de la convesion
		System.out.println("Quelle est la température à convertir ?");
		tempe = sc.nextDouble(); // on récupère la température à convertir
		switch (conv)
		{
		case 1:
		{tempFin = (((9d/5d) * tempe) + 32); //formule pour passer de Celcius à Fahrenheit
		erreur = 0;} // ce qui permettra de sortir de la boucle
		break;
		case 2:
		{tempFin = ((5 * (tempe - 32)) / 9); // formule pour passer de Farenheit à Celcius
		erreur = 0;} // ce qui permettra de sortir de la boucle
		break;
		default:
		{System.out.println("Choix incorrect"); // si le choix n'est pas 1 ou 2, il dit que c'est pas bon
		erreur = 1;} // la valeur de erreur est 1 donc on reste dans la boucle
		}
	}while (erreur == 1); //fin de la boucle
	if (conv == 1)
		System.out.println(tempe + "° Celcius = " + tempFin + "° Fahrenheit");
		else
			System.out.println(tempe + "° Farenheit = " + tempFin + "° Celcius");
		
	}
}
