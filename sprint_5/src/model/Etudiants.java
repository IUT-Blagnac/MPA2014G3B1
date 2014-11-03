package model;


public class Etudiants extends AbstractList {

	private String nom;
	private String prenom;
	private String grProjet;
	
	
	public Etudiants(String pGrProjet, String pNom, String pPrenom)
	{
		this.nom = pNom;
		this.prenom = pPrenom;
		this.grProjet = pGrProjet;
	}	
	
	public Etudiants()
	{
		this.nom = "";
		this.prenom = "";
		this.grProjet = "";
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

	public String getGrProjet() {
		return grProjet;
	}

	public void setGrProjet(String pGrProjet) {
		this.grProjet = pGrProjet;
	}
	
	public String toString()
	{
		return grProjet+ "   " + prenom  + "   " +  nom;
	}
	
	public String[] toTabString()
	{
		String[] tabS = { this.grProjet, this.prenom, this.nom };
		
		return tabS;
	}


}
