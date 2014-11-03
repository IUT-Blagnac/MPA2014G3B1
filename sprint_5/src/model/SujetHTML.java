package model;

public class SujetHTML {
	
	
	String li; //balise <li data-find="TitreSujet">
	String a; //balise <a href="#projets">
	String titre; // titre + espace
	String br; // <br/>
	String div; // <div style="white-space:normal;">
	String span; //balise <span>
	String b; //<b>
	String nomSujet; // nomSujet
	String Fb; //</b>
	String Fspan; //</span>
	String span2; //</span><span class="ui-li-count">
	String nGr; // NO
	String Fspan2; //</span>
	String Fdiv; //</div>
	String Fa; //</a>
	String Fli; //</li>
	
	public SujetHTML(Sujet sujet)
	{
		li = "balise <li data-find=\"" + sujet.getTitreSujet() + ">";
		a = "<a href=\"#projets\">";
		titre = sujet.getTitreSujet() + " ";
		br = "</br>";
		div = "<div style=\"white-space:normal;\">";
		span = "<span>";
		b = "<b>";
		nomSujet = sujet.getNomSujet();
		Fb = "<\b>";
		Fspan = "</span>";
		span2 = "</span><span class=\"ui-li-count\">";
		nGr = "NO";
		Fspan2 = "</span>";
		Fdiv ="</div>";
		Fa = "</a>";
		Fli = "</li>";
	}
	public String toString()
	{
		return li + a + titre + br + div + span + b + nomSujet + Fb + Fspan + span2+  nGr +Fspan2 + Fdiv+ Fa +Fli;
	}

}
