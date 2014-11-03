import model.Etudiants;



public class EtuHTML {

	
	String li; //balise <li data-find="prenom nom">
	String a; //balise <a href="#projets">
	String nom;
	String prenom;
	String span; //balise <span class="ui-li-count" title="Groupe">
	String groupe; //Groupe ngroupe
	String Fspan; //</span>
	String Fa; //</a>
	String Fli; //</li>
	
	
	public EtuHTML (Etudiants etu)
	{
		li = "<li data-find=\"" + etu.getPrenom() + " " + etu.getNom() + "\">";
		a = "<a href=\"#projets\">";
		nom = etu.getNom();
		prenom = etu.getPrenom();
		span = "<span class=\"ui-li-count\" title=\"Groupe\">";
		groupe = etu.getGrProjet();
		Fspan = "</span>";
		Fa = "</a>";
		Fli = "</li>";
	}
	
	
	public EtuHTML()
	{
		li = "<li data-find=\"" + "list-divider" + "\">";
		a = "<a href=\"#projets\">";
		nom = etu.getNom();
		prenom = etu.getPrenom();
		span = "<span class=\"ui-li-count\" title=\"Groupe\">";
		groupe = etu.getGrProjet();
		Fspan = "</span>";
		Fa = "</a>";
		Fli = "</li>";
	}
	
}
