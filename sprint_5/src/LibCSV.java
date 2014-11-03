import java.io.*; 
import java.util.*;

public class LibCSV {

	// Fonction ecrire : prend un paramètre une ArrayList<String[]> à écrire dans le fichier indiquer en paramètre
	public static void ecrire(ArrayList<String []> texte, String path) throws IOException{
		File  file = new File(path);
		PrintStream printS;
		try{
			printS = new PrintStream(file);
			for(int i = 0; i < texte.size(); i++){

				for(int j = 0; j < texte.get(i).length; j++){
					if(texte.get(i).length == (j+1)){
						printS.print(texte.get(i)[j]);
					} else {
						printS.print(texte.get(i)[j]+";");
					}
				}
				printS.print("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// Fonction lire : renvoie une ArrayList<String[]> cotenant le texte du fichier donner en paramètre
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
