import java.util.Scanner;


public class Debut {

	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	Scanner sd = new Scanner(System.in);
	int choix;
	String reponse;
	Humain sarah = new Humain(165,"Mimou","Burnvenville", 1988);
	Humain julburn = new Humain(182,"Link","Malmedy", 1987);
	System.out.println(sarah.getChat());
	System.out.println("Que veux-tu savoir ?");
	System.out.println("1. taille");
	System.out.println("2. Le nom du chat");
	System.out.println("3. Le village");
	System.out.println("4. L'ann�e de naissance");
	choix = sc.nextInt();
	System.out.println("ok");
	System.out.println("De Julien ou de Sarah ?");
	reponse = sd.nextLine();
	if(choix == 1)
		{if (reponse.equals("Julien"))
			System.out.println(julburn.taille);
		else
			System.out.println(sarah.taille);}
	else if(choix == 2)
		{if (reponse.equals("Julien"))
		System.out.println(julburn.nomDuChat);
		else
			System.out.println(sarah.nomDuChat);}
	else if(choix == 3)
		{if (reponse.equals("Julien"))
		System.out.println(julburn.village);
		else
			System.out.println(sarah.village);}
	else if(choix == 4)
		{if (reponse.equals("Julien"))
			System.out.println(julburn.anniversaire);
		else
			System.out.println(sarah.anniversaire);}
julburn.anniversaire = julburn.anniversaire - 1;
System.out.println(julburn.anniversaire);

	}
	
}
