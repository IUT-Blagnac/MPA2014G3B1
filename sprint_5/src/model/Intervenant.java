package model;

public class Intervenant extends AbstractList  {

	private String prenom;
	private String nom;
	
	public Intervenant(String pPrenom, String pNom)
	{
		this.prenom = pPrenom;
		this.nom = pNom;
	}	
	
	public Intervenant()
	{
		this("","") ;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String toString()
	{
		return prenom  + "   " +  nom;
	}
	
	public String[] toTabString()
	{
		String[] tabS = { this.prenom, this.nom };
		return tabS;
	}
	
}
