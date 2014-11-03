package model;
public class Sujet extends AbstractList {
	

	public String idSujet;
	public String nomSujet;
	public String titreSujet;
	
	public Sujet(String pIdSujet, String pTitreSujet , String pNomSujet)
	{
		this.idSujet = pIdSujet;
		this.nomSujet = pNomSujet;
		this.titreSujet = pTitreSujet;
	}	
	
	public Sujet()
	{
		this("","","") ;
	}	
	
	public String toString()
	{
		return idSujet + "   " + nomSujet + "   " + titreSujet;
	}
	
	public String[] toTabString()
	{
		String[] tabS = { this.idSujet, this.nomSujet, this.titreSujet};
		return tabS;
	}

	public String getIdSujet() {
		return idSujet;
	}

	public void setIdSujet(String idSujet) {
		this.idSujet = idSujet;
	}

	public String getNomSujet() {
		return nomSujet;
	}

	public void setNomSujet(String nomSujet) {
		this.nomSujet = nomSujet;
	}

	public String getTitreSujet() {
		return titreSujet;
	}

	public void setTitreSujet(String titreSujet) {
		this.titreSujet = titreSujet;
	}
	
}
