import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import model.AbstractList;
import model.EtuHTML;
import model.Etudiants;


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
		String bb =  (new EtuHTML()).toString();
		
		for(int i =0; i< listEtu.size(); i++)
		{
			tmp = new EtuHTML(listEtu.get(i));
			bb = bb + tmp.toString();
		}
		
		return bb;
		
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
