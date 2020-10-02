import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 char response = 'o';
 while (response == 'o')
 {
	 System.out.println("On boirait bien un truc non?? O/N");
	 Scanner p = new Scanner(System.in);
	 response = p.nextLine().charAt(0);
	 // Boucle d'erreur
	while (response != 'o' && response != 'n')
		{System.out.println("Try again !! ");
		response = p.nextLine().charAt(0);
		}
		if (response == 'o')
		{System.out.println("Bah mets 2 picons alors :-)");
		response = 'N';}
		else
		{System.out.println("Allait hein !!! Même pas un ??");
		System.out.println("");
		response = p.nextLine().charAt(0);
			if (response == 'n')
				{response = 'o';}
			}
 }
	}

}
