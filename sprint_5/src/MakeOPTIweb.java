import java.io.File;
import java.io.IOException;
import java.io.PrintStream;


public class MakeOPTIweb {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// fichier de sortie
		String path = "./OPTIweb/OPTIweb.html" ;
		File file = new File(path) ;
		PrintStream printS = new PrintStream(file);
		String[] debut = {
				"<!DOCTYPE html>" ,
				"<html>" ,
				"<head>" ,
				"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />" ,
				"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">" ,
				"<meta name=\"generator\" content=\"OPTIweb VOPTIweb\" />" ,
				"<title>0.1 - V0.1</title>" ,
				"<link rel=\"stylesheet\" href=\"http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css\" />" ,
				"<link rel=\"stylesheet\" href=\"http://code.jquery.com/mobile/1.4.2/jquery.mobile-1.4.2.min.css\" />" ,
				"<script src=\"http://code.jquery.com/jquery-1.9.1.min.js\"></script>" ,
				"<script src=\"http://code.jquery.com/mobile/1.4.2/jquery.mobile-1.4.2.min.js\"></script>" ,
				"<style type=\'text/css\'>" ,
				"@media all and (orientation:portrait) { .landscape {display: none;} }" ,
				"@media all and (orientation:landscape) { .landscape {display: inline;} }" ,
				"</style>" ,
				"</head><body>" ,
				"" ,
				"<!-- DEBUT page accueil -->" ,
				"<div data-role=\"page\" id=\"accueil\" data-title=\"OPTIweb - V0.1\">" ,
				"<div data-role=\"header\" data-add-back-btn=\"true\">" ,
				"<h1>P<span class=\"landscape\">rojets </span>tut<span class=\"landscape\">orés</span> 2014-2015<br/>Département INFO<span class=\"landscape\">RMATIQUE</span><br/>IUT de Blagnac</h1>" ,
				"<a href=\"#credits\" data-theme=\"b\" class=\"ui-btn-right\">Crédits</a>" ,
				"</div>" ,
				"<div data-role=\"content\">" ,
				"<ul data-role=\"listview\" data-inset=\"true\" id=\"listeSources\">" ,
				"  <li><a href=\"#projets\"><i class=\"fa fa-tasks\"></i> Projets</a></li>" ,
				"  <li><a href=\"#sujets\"><i class=\"fa fa-copy\"></i> Sujets</a></li>" ,
				"  <li><a href=\"#etudiants\"><i class=\"fa fa-group\"></i> Etudiants</a></li>" ,
				"  <li><a href=\"#intervenants\"><i class=\"fa fa-group\"></i> Intervenants</a></li>" ,
				"" ,
				"</ul>" ,
				"</div>" ,
				"<div data-role=\"footer\">" ,
				" <h4>OPTIweb V<span class=\"landscape\">ersion </span>0.1 <i class=\"fa fa- fa-2x\"></i></h4>" ,
				"</div>" ,
				"</div>" ,
				"<!-- FIN page accueil -->" ,
				"" ,
				"<!-- DEBUT page credits -->" ,
				"<div data-role=\"page\" id=\"credits\" data-title=\"OPTIweb - V0.1 - Crédits\">" ,
				"<div data-role=\"header\" data-add-back-btn=\"true\">" ,
				"<h1>Crédits</h1>" ,
				"</div>" ,
				"<div data-role=\"content\">" ,
				"    <p>Cette application a été réalisée dans le cadre du module M3301/MPA du DUT Informatique à l'IUT de Blagnac.</p>" ,
				"<ul data-role=\"listview\" data-inset=\"true\" id=\"contacts\" data-theme=\"a\" data-divider-theme=\"b\">" ,
				"    <li data-role=\"list-divider\">Product Owner</li>" ,
				"    <li>André PÉNINOU</li>" ,
				"    <li>Université Toulouse 2 - IUT de Blagnac" ,
				"    <br/>Département INFORMATIQUE</li>" ,
				"</ul>" ,
				"<ul data-role=\"listview\" data-inset=\"true\" id=\"listecredits\" data-theme=\"a\" data-divider-theme=\"b\">" ,
				"    <li data-role=\"list-divider\">Membres de l'équipe enseignante</li>" ,
				"<li>Jean-Michel BRUEL</li><li>Jean-Michel INGLEBERT</li><li>André PÉNINOU</li><li>Olivier ROQUES</li>" ,
				"</ul>" ,
				"<ul data-role=\"listview\" data-inset=\"true\" id=\"listepowered\" data-theme=\"a\" data-divider-theme=\"b\">" ,
				"    <li data-role=\"list-divider\">Propulsé par</li>" ,
				"    <li><a href=\"http://jquerymobile.com/\" target=\"autrePage\">http://jquerymobile.com/</a></li>" ,
				"    <li><a href=\"http://fortawesome.github.io/Font-Awesome/\" target=\"autrePage\">http://fortawesome.github.io/Font-Awesome/</a></li>" ,
				"</ul>" ,
				"</div>" ,
				"<div data-role=\"footer\"> " ,
				" <h4>OPTIweb V<span class=\"landscape\">ersion </span>0.1 <i class=\"fa fa- fa-2x\"></i></h4>" ,
				"</div>" ,
				"</div>" ,
				"<!-- FIN page credits -->" ,
				"" ,
				"<!-- DEBUT page projets -->" ,
				"<div data-role=\"page\" id=\"projets\" data-title=\"OPTIweb - V0.1\">" ,
				"<div data-role=\"header\" data-add-back-btn=\"true\">" ,
				"<h1>Projets 2014-2015</h1>" ,
				"" ,
				"</div>" ,
				"<div data-role=\"content\">" ,
				"  " ,
				"  <form class=\"ui-filterable\"><input id=\"autocomplete-input-projet\" name=\"projet\" data-type=\"search\" placeholder=\"Vous cherchez ?...\"></form><ol id=\"listeprojets\" data-role=\"listview\" data-inset=\"true\" data-filter=\"true\"" , 
				"data-filter-reveal=\"false\" data-input=\"#autocomplete-input-projet\"><li><p><b>[Archeologie]</b> Groupe de recherche Chasséen Méridional</p><p><b>Client :</b> TISSIER Evelyne</p><p><b>Superviseur :</b> CANUT Marie-Françoise" ,
				"</p><p><b>Groupe A :</b> Etienne LARROUY - Victor PINQUIER - Antoine RIVALIER - Jean-Sebastien TRILLE - </p></li><li><p><b>[SWAML]</b> Site web association \"Marie Louise\"</p><p><b>Client :</b> LAFON Isabelle</p><p><b>" ,
				"Superviseur :</b> DEMAY Laurent</p><p><b>Groupe B :</b> Julie BADETS - Nicolas GAUTHIER - Theophane GIRARD - Simon PREVIDENTE - </p></li><li><p><b>[ReconfMI]</b> Développement interface graphique</p><p><b>Client :</b> STOLF " ,
				"Patricia</p><p><b>Superviseur :</b> CANUT Marie-Françoise</p><p><b>Groupe C :</b> Julien CORDEAU-GONORD - Florian GARIBAL - Serge MOLINA - Romain NOTO - </p></li><li><p><b>[GESDEP]</b> Finalisation et déploiement de " ,
				"l'application de gestion des déplacements des personnels</p><p><b>Client :</b> DARAN Xavier</p><p><b>Superviseur :</b> REDON Laurence</p><p><b>Groupe D :</b> Tim DAZAYOUS - Alexandre ERB - Gabriel GODARD - Corentin HERMET - " ,
				"Nathan LOPEZ - </p></li><li><p><b>[SimulMI]</b> Développement de simulateur</p><p><b>Client :</b> STOLF Patricia</p><p><b>Superviseur :</b> DE MICHIEL Marianne</p><p><b>Groupe E :</b> Adrien AVILES - Aurelien BERNIER LEVALOIS " ,
				"- Allan PERRIN - Theo PIBOUBES - </p></li><li><p><b>[BDM NoSQL]</b> Développement d’un logiciel de conception d’une base de données multidimensionnelles</p><p><b>Client :</b> TESTE Olivier</p><p><b>Superviseur :</b> ROQUES " ,
				"Olivier</p><p><b>Groupe F :</b> Arnauld ALEX - Nicolas AUBERT - Tiphaine MARTINEZ - Kristen VIGUIER - </p></li><li><p><b>[E-ICGD]</b> Environnement d'intégration continue de génération de documentation</p><p><b>Client :</b> " ,
				"BRUEL Jean-Michel</p><p><b>Superviseur :</b> ROQUES Olivier</p><p><b>Groupe G :</b> Pierre JEANJEAN - Quentin LACOSTE - Florian OUDDANE - Anselme REVUZ - </p></li><li><p><b>[PrestaShop]</b> Application et tutoriel sur " ,
				"Prestashop (logiciel e-commerce gratuit )</p><p><b>Client :</b> NONNE Laurent</p><p><b>Superviseur :</b> CHANCOGNE Laurent</p><p><b>Groupe H :</b> Adrien ANDUZE - Alexandre MAGISSON - Anais RIGAL - </p></li><li><p><b>" ,
				"[ApexEComm]</b> Application et tutoriel Oracle Apex pour un site d'e-commerce</p><p><b>Client :</b> NONNE Laurent</p><p><b>Superviseur :</b> TESTE Olivier</p><p><b>Groupe I :</b> Camille ALRAM - Yassine CHAHID KSABI - Remi " ,
				"HANNE - Edwin MARTIN - </p></li><li><p><b>[SoftVolley]</b> SoftVolley : explication de stratégies de jeu au Volley-ball</p><p><b>Client :</b> MOULIN Cyril</p><p><b>Superviseur :</b> PÉNINOU André</p><p><b>Groupe J :</b> " ,
				"Tristan BAVEREZ - Clement BOUSQUET - Alexane DUROZIER - </p></li><li><p><b>[Prodif]</b> Refactoring de l'application Java PRODIF</p><p><b>Client :</b> BRUEL Jean-Michel</p><p><b>Superviseur :</b> OBER Iulian</p><p><b>Groupe K " ,
				":</b> Lucas GAMEZ - Alexis LIEU - Mathieu POUX - Mehdi SLAMNIA - </p></li><li><p><b>[RegExp]</b> Application pédagogique d'apprentissage des expressions régulières par l'expérience</p><p><b>Client :</b> SOTIN Pascal</p><p><b>" ,
				"Superviseur :</b> BOULLE Rémi</p><p><b>Groupe L :</b> Benjamin COLLIGNON - Jean-Philippe PERE - Nathan SANTACANA - Vimel VERON - </p></li><li><p><b>[Refactor]</b> Refactoring de site web statique en site web dynamique" ,
				"</p><p><b>Client :</b> BRUEL Jean-Michel</p><p><b>Superviseur :</b> OBER Iulian</p><p><b>Groupe M :</b> Nicolas BOCHU - Jean-Brice CANIHAC - Allan DIAZ - Vincent EYCHENNE - Sylvain MAILLOT - </p></li><li><p><b>[Architekt]</b> " ,
				"Architekt</p><p><b>Client :</b> CHANCOGNE Laurent</p><p><b>Superviseur :</b> INGLEBERT Jean-Michel</p><p><b>Groupe N :</b> Alexandre BONNET - Timothee FICAT - Killian TESSIER - Thomas VINCENOT - </p></li><li><p><b>[Architekt]" ,
				"</b> Architekt</p><p><b>Client :</b> CHANCOGNE Laurent</p><p><b>Superviseur :</b> SOTIN Pascal</p><p><b>Groupe O :</b> Mael AUBERT - Bilal EL YASSEM - Guillaume FOURNET - Aurelien SCUOTTO - Damien WOJTOWICZ - " ,
				"</p></li><li><p><b>[Carsat]</b> Questionnaire client sur page web et traitement des données</p><p><b>Client :</b> HARDY Laurent</p><p><b>Superviseur :</b> DEMAY Laurent</p><p><b>Groupe P :</b> Jeremy ALVES NETO - Anais " ,
				"CHAUMEIL - Lea FOISSAC - Leo JOSEPH - Marine SUTARIK - </p></li><li><p><b>[PrestaShop]</b> Application et tutoriel sur Prestashop (logiciel e-commerce gratuit )</p><p><b>Client :</b> NONNE Laurent</p><p><b>Superviseur :</b> " ,
				"VERDIER Michèle</p><p><b>Groupe Q :</b> Quentin CESPEDES - Alex JACQUOT-FERNANDEZ - Hanae RHAYOUR - Abdellah ZARIOH - </p></li></ol>" ,
				"</div>" ,
				"<div data-role=\"footer\"> " ,
				" <h4>OPTIweb V<span class=\"landscape\">ersion </span>0.1 <i class=\"fa fa-tasks fa-2x\"></i></h4>" ,
				"</div>" ,
				"</div>" ,
				"<!-- FIN page projets -->" ,
				"<!-- DEBUT page sujets -->" ,
				"<div data-role=\"page\" id=\"sujets\" data-title=\"OPTIweb - V0.1\">" ,
				"<div data-role=\"header\" data-add-back-btn=\"true\">" ,
				"<h1>Sujets 2014-2015</h1>" ,
				"" ,
				"</div>" ,
				"<div data-role=\"content\">" ,
				"" ,
				"  <form class=\"ui-filterable\"><input id=\"autocomplete-input-sujet\" name=\"sujet\" data-type=\"search\" placeholder=\"Vous cherchez ?\"></form><ol id=\"listesujets\" data-role=\"listview\" data-inset=\"true\" data-filter=\"true\" data-filter-reveal=\"false\" data-input=\"#autocomplete-input-sujet\" data-divider-theme=\"b\" data-count-theme=\"a\">"
		} ;

		String[] suite1 = {
				"</ol>" ,
				"</div>" ,
				"<div data-role=\"footer\">" ,
				" <h4>OPTIweb V<span class=\"landscape\">ersion </span>0.1 <i class=\"fa fa-copy fa-2x\"></i></h4>" ,
				"</div>" ,
				"</div>" ,
				"<!-- FIN page sujets -->" ,
				"" ,
				"<!-- DEBUT page etudiants -->" ,
				"<div data-role=\"page\" id=\"etudiants\" data-title=\"OPTIweb - V0.1\">" ,
				"<div data-role=\"header\" data-add-back-btn=\"true\">" ,
				"<h1>Etudiants 2014-2015</h1>" ,
				"" ,
				"</div>" ,
				"<div data-role=\"content\">" ,
				"" ,
				"  <form class=\"ui-filterable\"><input id=\"autocomplete-input-etudiant\" name=\"etudiant\" data-type=\"search\" placeholder=\"Etudiant ou Groupe X\"></form><ol id=\"listeetudiants\" data-role=\"listview\" data-inset=\"true\" data-filter=\"true\" data-filter-reveal=\"false\" data-input=\"#autocomplete-input-etudiant\" data-divider-theme=\"b\">"
		} ;

		String[] suite2 = {
				"</ol>" ,
				"</div>" ,
				"<div data-role=\"footer\"> " ,
				" <h4>OPTIweb V<span class=\"landscape\">ersion </span>0.1 <i class=\"fa fa-group fa-2x\"></i></h4> " ,
				"</div>" ,
				"</div>" ,
				"<!-- FIN page etudiants -->" ,
				"" ,
				"<!-- DEBUT page intervenants -->" ,
				"<div data-role=\"page\" id=\"intervenants\" data-title=\"OPTIweb - V0.1\">" ,
				"<div data-role=\"header\" data-add-back-btn=\"true\">" ,
				"<h1>Intervenants 2014-2015</h1>" ,
				"" ,
				"</div>" ,
				"<div data-role=\"content\">" ,
				"  " ,
				"  <form class=\"ui-filterable\"><input id=\"autocomplete-input-intervenant\" name=\"intervenant\" data-type=\"search\" placeholder=\"Intervenant\"></form><ul id=\"listeintervenants\" data-role=\"listview\" data-inset=\"true\" data-filter=\"true\" data-filter-reveal=\"false\" data-input=\"#autocomplete-input-intervenant\" data-divider-theme=\"b\">"
		} ;

		String[] fin = {
				"</ul>" ,
				"</div>" ,
				"<div data-role=\"footer\"> " ,
				" <h4>OPTIweb V<span class=\"landscape\">ersion </span>0.1 <i class=\"fa fa-group fa-2x\"></i></h4> " ,
				"</div>" ,
				"</div>" ,
				"<!-- FIN page intervenants -->" ,
				"" ,
				"<script>" ,
				" // li click handler which fills the projects search bar " ,
				" // with the value of the current data-find attribute" ,
				" $( ''li[data-find]'' ).on( ''click'',function(event){" ,
				"  $(\"#autocomplete-input-projet\").val($(this).attr(''data-find'')).trigger(''change'');" ,
				" });" ,
				"</script>" ,
				"</body>" ,
				"</html>"
		};

		
		
		// écriture du début
		for (String s : debut) {
			printS.write((s + "\n").getBytes()) ;
		}

		// écriture des sujets
		printS.write( Transform.SUJETtoHTML(Transform.CSVtoSujet("./data/sujets2014_2015.csv")).getBytes()) ;
		for (String s : suite1) {
			printS.write((s + "\n").getBytes()) ;
		}

		// écriture des étudiants
		printS.write( Transform.ETUtoHTML(Transform.CSVtoETU("./data/etudiants2014_2015.csv")).getBytes() ) ;
		for (String s : suite2) {
			printS.write((s + "\n").getBytes()) ;
		}


		// écriture des intervenant et fin
		printS.write( Transform.INTERtoHTML(Transform.CSVtoSIntervenant("./data/intervenants2014_2015.csv")).getBytes() ) ;
		for (String s : fin) {
			printS.write((s + "\n").getBytes()) ;
		}

	}
}
