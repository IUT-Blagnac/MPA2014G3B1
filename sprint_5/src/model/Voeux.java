package model;
public class Voeux extends AbstractList {
	
	private Groupes Groupe;
	private Sujet id;
	private int numero;
	
	public Voeux(Groupes pNumGroupe, Sujet pId, int pNumero)
	{
		this.Groupe = pNumGroupe;
		this.id = pId;
		this.numero = pNumero;
	}	
	
	public Voeux()
	{
		this.Groupe = null;
		this.id = null;
		this.numero = 0;
	}
	
	@Override
	public String[] toTabString() {
		String[] tabS = { this.Groupe.toTabString().toString(), this.id.toTabString().toString(), this.numero+""};
		return tabS;
	}


	public Groupes getGroupe() {
		return this.Groupe;
	}


	public void setGroupe(Groupes pGroupes) {
		this.Groupe = pGroupes;
	}
	
	public Sujet getId() {
		return this.id;
	}


	public void setId(Sujet pId) {
		this.id = pId;
	}
	
	public int getNumero() {
		return this.numero;
	}


	public void setNumero(int pNumero) {
		this.numero = pNumero;
	}
}
