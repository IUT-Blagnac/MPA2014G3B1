package model;

public class IntervenantHTML {
	String li; //balise <li data-find="nom prenom">
	String a; //balise <a href="#projets">
	String nom;
	String prenom;
	String span; //balise <span class="ui-li-count" style="right: 120px !important;" title="Client">
	String nbClient; //Nombre de fois client
	String Fspan; //</span>
	String span2; //<span class="ui-li-count" title="Superviseur">
	String nbSuperviseur; //Nombre de fois supeviseur
	String Fspan2; //</span>
	String Fa; //</a>
	String Fli; //</li>
	
	
	public IntervenantHTML (Intervenant inter)
	{
		li = "<li data-find=\"" + inter.getNom() + " " + inter.getPrenom() + "\">";
		a = "<a href=\"#projets\">";
		nom = inter.getNom();
		prenom = " " + inter.getPrenom();
		span = "<span class=\"ui-li-count\" style=\"right: 120px !important;\" title=\"Client\">";
		nbClient = "" + 0;
		Fspan = "</span>";
		span2 = "<span class=\"ui-li-count\" title=\"Superviseur\">";
		nbSuperviseur = "" + 1;	
		Fspan2 = "</span>";
		Fa = "";
		Fli = "</li>";
		
	}
	
	
	public IntervenantHTML()
	{
		li = "<li data-role=\"list-divider\">";
		a = "";
		nom = "Intervenant";
		prenom = "";	
		span = "<span class=\"ui-li-count\" style=\"right: 110px !important;\" title=\"Client\">";
		nbClient = "Client";
		Fspan = "</span>";
		span2 = "<span class=\"ui-li-count\" title=\"Superviseur\">";
		nbSuperviseur = "Superviseur";
		Fspan2 = "</span>";
		Fa = "";
		Fli = "</li>";
	}
	
	
	public String toString()
	{
		return li + a + nom + prenom + span + nbClient + Fspan + span2 + nbSuperviseur + Fspan2 + Fa + Fli;
	}
}
