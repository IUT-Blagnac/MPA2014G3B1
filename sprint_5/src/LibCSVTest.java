import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.ArrayList;


import junit.framework.TestCase;
import junit.framework.TestSuite;

public class LibCSVTest extends TestCase {
	static String programmeATester = "LibCSV" ;
	Process executionProgrammeATester ; 
	BufferedReader ecranProgrammeATester ; 
	BufferedWriter clavierProgrammeATester ; 


	public static void main(String[] args) {
		if ( args.length > 0 ) { programmeATester = args[0] ; }
		System.out.println("Tests du programme : " + programmeATester);
		junit.textui.TestRunner.run(new TestSuite(LibCSVTest.class)); 
	}

	protected void setUp() throws IOException {  
		//executionProgrammeATester = Runtime.getRuntime().exec("\"c:\\Program Files\\Java\\jre7\\bin\\java.exe\" -cp U:\\E\\MPA\\projet\\workspace\\G0A1\\bin "+programmeATester); 
		//executionProgrammeATester = Runtime.getRuntime().exec("java.exe -cp U:\\E\\MPA\\projet\\workspace\\G0A1\\bin "+programmeATester); 
		executionProgrammeATester = Runtime.getRuntime().exec("java -cp .;bin "+programmeATester); 
		ecranProgrammeATester = new BufferedReader(new  InputStreamReader( executionProgrammeATester.getInputStream() )); 
		clavierProgrammeATester  = new BufferedWriter(new OutputStreamWriter( executionProgrammeATester.getOutputStream() )); 
	}

	public void test_fichier_cree() throws IOException {
		String path = "../data/tests.csv" ;
		ArrayList<String[]> test = new ArrayList<String[]>() ;
		String[] ligne = {"test 1","2","3"} ;
		test.add(ligne) ;
		LibCSV.ecrire(test, path) ;
		File file = new File(path) ;
		assertTrue("Fichier non cree",file.exists());
	}

	public void test_fichier_nonExist() throws IOException {
		String path = "../data/testsNonExist.csv" ;
		boolean exception = false ;
		try {
			LibCSV.lire(path) ;
		} catch (IOException e) {
			exception = true ;
		}
		assertTrue("Fichier inexistant mais pas d exception",exception) ;
	}

	public void test_lecture() throws IOException {
		ArrayList<String []> texte = new ArrayList<>();
		String[] tabTest1 = {"test1", "test2", "test3"};
		texte.add(tabTest1);

		File projet = new File("../data/tests.csv");

		 PrintStream printCsv = new PrintStream(projet);
		for(int i = 0; i < texte.size(); i++){
			for(int j = 0; j < texte.get(i).length; j++){
				if(texte.get(i).length == (j+1)){
					printCsv.print(texte.get(i)[j]);
				} else {
					printCsv.print(texte.get(i)[j]+";");
				}
			}
			printCsv.print("\n");
		}


		assertEquals(texte.get(0)[0], LibCSV.lire("../data/tests.csv").get(0)[0]);
		assertEquals(texte.get(0)[1], LibCSV.lire("../data/tests.csv").get(0)[1]);
		assertEquals(texte.get(0)[2], LibCSV.lire("../data/tests.csv").get(0)[2]);
	}

	public void test_ecriture() throws IOException {
		ArrayList<String []> texte = new ArrayList<>();
		String[] tabTest1 = {"test1", "test2", "test3"};
		texte.add(tabTest1);
		String file = "../data/tests.csv" ;
		String ligne = null ;
		LibCSV.ecrire(texte, file) ;

		ArrayList<String []> result = new ArrayList<>();

		BufferedReader ficTexte;

		ficTexte = new BufferedReader(new FileReader(new File(file)));
		String tab[];
		do {
			ligne = ficTexte.readLine();
			if (ligne != null) {
				tab = ligne.split(";");
				result.add(tab);
			}
		} while (ligne != null);
		ficTexte.close();

		assertEquals(texte.get(0)[0], result.get(0)[0]);
		assertEquals(texte.get(0)[1], result.get(0)[1]);
		assertEquals(texte.get(0)[2], result.get(0)[2]);
	}
}
