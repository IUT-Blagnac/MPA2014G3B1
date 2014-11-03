import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MakeOPTIwebTest extends TestCase {
	static String programmeATester = "MakeOPTIweb" ;
	Process executionProgrammeATester ; 
	BufferedReader ecranProgrammeATester ; 
	BufferedWriter clavierProgrammeATester ; 


	public static void main(String[] args) {
		if ( args.length > 0 ) { programmeATester = args[0] ; }
		System.out.println("Tests du programme : " + programmeATester);
		junit.textui.TestRunner.run(new TestSuite(MakeOPTIwebTest.class)); 
	}

	protected void setUp() throws IOException {  
		
	}

	public void test_fichier_cree() throws IOException {
		String path = "../OPTIweb/OPTIweb.html" ;
		MakeOPTIweb.main(null) ;
		File file = new File(path) ;
		assertTrue("Fichier non cree",file.exists());
	}
}
   