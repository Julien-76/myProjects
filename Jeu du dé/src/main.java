import java.io.IOException;

public class main {
	

	public static void main(String[] args) throws IOException 
	{
		float des;
		// TODO Auto-generated method stub
		System.out.println("Tu ne sais pas quelle bière boire?");
		System.in.read();
		System.out.println("");
		System.out.println("Laisse les dés choisir pour toi !");
		System.out.println("");
		System.in.read();
		des = (float)Math.random();
		des = 54 * des;
		int r = (int)des;
		String l;
		r = 1 + r;
		System.in.read();
		if (r <= 9) {
		System.out.println("Le premier dé est tombé sur le frigo 1 (Que du bon !!) :");
		System.out.println("Rochefort 6");
		System.out.println("Rochefort 8");
		System.out.println("Rochefort 10");
		System.out.println("St Bernardus");
		System.out.println("Achel Blonde");
		System.out.println("Achel Brune");
		System.out.println("Westmalle Double");
		System.out.println("Westmalle Triple");
		System.out.println("Orval");}
		else if (r >= 10 && r <= 19) {
		System.out.println("Le premier dé est tombé sur le frigo 2 (C'est pas le meilleur...) :");
		System.out.println("Chimay Rouge");
		System.out.println("Chimay Blanche");
		System.out.println("Chimay Bleue");
		System.out.println("Duvel");
		System.out.println("Duvel Triple Hop");
		System.out.println("Kasteel Rouge");
		System.out.println("Super des Fagnes Blonde");
		System.out.println("Super des Fagnes Brune");
		System.out.println("Malmedy Blonde");
		System.out.println("Malmedy Brune");}
		else if (r >= 20 && r <= 31) {
		System.out.println("Le premier dé est tombé sur le frigo 3 (Que des valeurs sures)");
		System.out.println("Trappe Blanche");
		System.out.println("Trappe Pure");
		System.out.println("Trappe Blonde");
		System.out.println("Trappe Double");
		System.out.println("Trappe Isidor");
		System.out.println("Trappe Triple");
		System.out.println("Trappe Quadruple");
		System.out.println("Triple d'Anvers");
		System.out.println("Lupulus Blanche");
		System.out.println("Lupulus Opera");
		System.out.println("Lupulus Triple");
		System.out.println("Lupulus Fructus");}
		else if (r >= 32 && r <= 40) {
		System.out.println("Le premier dé est tombé sur le frigo 4 (Toutes pas mal... sauf une...)");
		System.out.println("Bellevaux TPA");
		System.out.println("Bellevaux Blanche");
		System.out.println("Bellevaux Brune");
		System.out.println("Bellevaux Triple");
		System.out.println("Bellevaux Black");
		System.out.println("Kwak");
		System.out.println("Triple Karmeliet");
		System.out.println("Goose IPA");
		System.out.println("Scotch Gordon");}
		else if (r >= 41 && r <= 48) {
		System.out.println("Le premier dé est tombé sur le frigo 5 ! (Aucun soucis à te faire, que du bon !)");
		System.out.println("Val Dieu Triple");
		System.out.println("Val Dieu Blonde");
		System.out.println("Val Dieu Brune");
		System.out.println("Mc Chouffe");
		System.out.println("Chouffe Blanche");
		System.out.println("Chouffe Houblon");
		System.out.println("N'ice Chouffe");
		System.out.println("Chouffe Cherry");}
		else if (r >= 49 && r <= 54) {
		System.out.println("Le premier dé tombe sur la catégorie des bières au fût !");
		System.out.println("Chouffe au fût");
		System.out.println("Scotch au fût");
		System.out.println("Leffe brune");
		System.out.println("Leffe Blonde");
		System.out.println("Leffe Rubis");
		System.out.println("Hoegaarden");}
		System.in.read();
		System.out.println("");
		System.in.read();
		System.out.println("Voici le lancé du deuxième dé !");
		System.in.read();
		System.out.println("");
		System.out.print("Tu vas devoir boire ");
		if(r == 9 || r == 40 || r == 50)
		l = "un ";
		else
		l = "une ";
		System.out.print(l);
		switch (r)
		{
		// Frigo 1 :
		case 1:
		System.out.print("Rochefort 6");
		break;
		case 2:
		System.out.print("Rochefort 8");
		break;
		case 3:
		System.out.print("Rochefort 10");
		break;
		case 4:
		System.out.print("St Bernardus");
		break;
		case 5:
		System.out.print("Achel Blonde");
		break;
		case 6:
		System.out.print("Achel Brune");
		break;
		case 7:
		System.out.print("Westmalle Triple");
		break;
		case 8:
		System.out.print("Westmalle Double");
		break;
		case 9:
		System.out.print("Orval");
		break;
		// Frigo 2 :
		case 10:
		System.out.print("Chimay Bleue");
		break;
		case 11:
		System.out.print("Chimay Blanche");
		break;
		case 12:
		System.out.print("Chimay Rouge");
		break;
		case 13:
		System.out.print("Duvel");
		break;
		case 14:
		System.out.print("Duvel Triple Hop");
		break;
		case 15:
		System.out.print("Kasteel Rouge (Shaaaade !!!)");
		break;
		case 16:
		System.out.print("Super des Fagnes Blonde");
		break;
		case 17:
		System.out.print("Super des Fagnes Brune");
		break;
		case 18:
		System.out.print("Malmedy Brune ( Shaaade !)");
		break;
		case 19:
		System.out.print("Malmedy Blonde ( Shaaaade !!)");
		break;
		// Frigo 3 :
		case 20:
		System.out.print("Trappe Blanche");
		break;
		case 21:
		System.out.print("Trappe Pure");
		break;
		case 22:
		System.out.print("Trappe Blonde");
		break;
		case 23:
		System.out.print("Trappe Brune");
		break;
		case 24:
		System.out.print("Trappe Isidor");
		break;
		case 25:
		System.out.print("Trappe Triple");
		break;
		case 26:
		System.out.print("Trappe Quadruple");
		break;
		case 27:
		System.out.print("Tripple d'Anvers");
		break;
		case 28:
		System.out.print("Lupulus Blanche");
		break;
		case 29:
		System.out.print("Lupulus Opera");
		break;
		case 30:
		System.out.print("Lupulus Triple");
		break;
		case 31:
		System.out.print("Lupulus Fructus");
		break;
		// Frigo 4
		case 32:
		System.out.print("Bellevaux TPA");
		break;
		case 33:
		System.out.print("Bellevaux Blanche");
		break;
		case 34:
		System.out.print("Bellevaux Brune");
		break;
		case 35:
		System.out.print("Bellevaux Triple");
		break;
		case 36:
		System.out.print("Bellevaux Black");
		break;
		case 37:
		System.out.print("Kwak");
		break;
		case 38:
		System.out.print("Triple Karmeliet");
		break;
		case 39:
		System.out.print("Goose IPA");
		break;
		case 40:
		System.out.print("Scotch Gordon (Over Shaaaaaaaaaaade) !!!!");
		break;
		// Frigo 5
		case 41:
		System.out.print("Val Dieu Triple");
		break;
		case 42:
		System.out.print("Val Dieu Blonde");
		break;
		case 43:
		System.out.print("Val Dieu Brune");
		break;
		case 44:
		System.out.print("Mc Chouffe");
		break;
		case 45:
		System.out.print("Chouffe Blanche");
		break;
		case 46:
		System.out.print("Chouffe Houblon");
		break;
		case 47:
		System.out.print("N'ice Chouffe");
		break;
		case 48:
		System.out.print("Chouffe Cherry");
		break;
		// Fut
		case 49:
		System.out.print("Chouffe au fût");
		break;
		case 50:
		System.out.print("Scotch au fût");
		break;
		case 51:
		System.out.print("Leffe Brune");
		break;
		case 52:
		System.out.print("Leffe Blonde");
		break;
		case 53:
		System.out.print("Leffe Rubby");
		break;
		case 54:
		System.out.print("Hoegaaaaaarden");
		break;
		default:
		System.out.print(" ");
		}
		}
		
	}
