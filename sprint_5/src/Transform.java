import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import model.AbstractList;
import model.EtuHTML;
import model.Etudiants;
import model.Intervenant;
import model.IntervenantHTML;
import model.Sujet;
import model.SujetHTML;


abstract class Transform {
	
	
	// Convertit un CSV en ArrayList d'Ètudiant
	public static ArrayList<Etudiants> CSVtoETU ( String file) throws IOException
	{
		ArrayList<String []> listeEtuS = lire( file);
		ArrayList<Etudiants> listEtu = new ArrayList<>();
		
		for(int i=0; i<listeEtuS.size(); i++)
		{
			listEtu.add( new Etudiants(listeEtuS.get(i)[0], listeEtuS.get(i)[1], listeEtuS.get(i)[2]) );
		}
		
		return listEtu;
	}
	
	

	// Convertit un CSV en ArrayList d'Ètudiant
	public static String ETUtoHTML ( ArrayList<Etudiants> listEtu)
	{
		EtuHTML tmp;
		String chaine = ""; // (new EtuHTML()).toString();
		
		chaine = (new EtuHTML()).toString();

		for(int i = 1; i< listEtu.size(); i++)
		{
			tmp = new EtuHTML(listEtu.get(i));
			chaine = chaine + tmp.toString();
		}
		
		return chaine;
		
	}
	
	// Convertit un CSV en ArrayList d'Ètudiant
	public static ArrayList<Sujet> CSVtoSujet ( String file) throws IOException
	{
		ArrayList<String []> ListSujetS = lire( file);
		ArrayList<Sujet> ListSujet = new ArrayList<>();
		
		for(int i=0; i<ListSujetS.size(); i++)
		{
			ListSujet.add( new Sujet(ListSujetS.get(i)[0], ListSujetS.get(i)[1], ListSujetS.get(i)[2]) );
		}
		
		return ListSujet;
	}
	
	

	// Convertit un CSV en ArrayList d'Ètudiant
	public static String SUJETtoHTML ( ArrayList<Sujet> listSujet)
	{
		SujetHTML tmp;
		String chaine = ""; // (new SujetHTML()).toString();
		
		chaine = "" + (new SujetHTML()).toString();
		for(int i = 1; i< listSujet.size(); i++)
		{
			tmp = new SujetHTML(listSujet.get(i));
			chaine = chaine + tmp.toString();

		}
		
		
		return chaine;
		
	}
	
	// Convertit un CSV en ArrayList d'intervenant
	public static ArrayList<Intervenant> CSVtoSIntervenant ( String file) throws IOException
	{
		ArrayList<String []> ListInterS = lire( file);
		ArrayList<Intervenant> ListInter = new ArrayList<>();
		
		for(int i=0; i<ListInterS.size(); i++)
		{
			ListInter.add( new Intervenant(ListInterS.get(i)[0], ListInterS.get(i)[1]) );
		}
		
		return ListInter;
	}
	
	

	// Convertit un CSV en ArrayList d'Ètudiant
	public static String INTERtoHTML ( ArrayList<Intervenant> ListInter)
	{
		IntervenantHTML tmp;
		String chaine = ""; // (new SujetHTML()).toString();
		
		chaine = "" + (new IntervenantHTML()).toString();
		for(int i = 1; i< ListInter.size(); i++)
		{
			tmp = new IntervenantHTML(ListInter.get(i));
			chaine = chaine + tmp.toString();

		}
		
		
		return chaine;
		
	}
	
	
	

	
	// Fonction lire : renvoie une ArrayList<String[]> cotenant le texte du fichier donner en param√®tre
	public static ArrayList<String []> lire(String path) throws IOException{
		String ligne = "";
		ArrayList<String []> result = new ArrayList<>();
		BufferedReader br;
		br = new BufferedReader(new FileReader(new File(path)));
		String tab[];
		do {
			ligne = br.readLine();
			if (ligne != null) {
				tab = ligne.split(";");
				result.add(tab);
			}
		} while (ligne != null);
		br.close();
		return result;
	}
}
