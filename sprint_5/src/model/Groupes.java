package model;

public class Groupes extends AbstractList {
	
	private String libelle;

	public Groupes(String pLibelle)
	{
		this.libelle = pLibelle;
	}	
	
	public Groupes()
	{
		this.libelle = "";
	}
	
	@Override
	public String[] toTabString() {
		String[] tabS = { this.libelle};
		return tabS;
	}


	public String getLibelle() {
		return this.libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	public String toString() {
		return this.libelle ;
	}


}
