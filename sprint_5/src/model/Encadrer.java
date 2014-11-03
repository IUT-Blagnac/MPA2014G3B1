package model;


public class Encadrer extends AbstractList {
	
	private Project projet;
	private Intervenant intervenant;
	
	public Encadrer(Project pProjet, Intervenant pIntervenant)
	{
		this.projet = pProjet;
		this.intervenant = pIntervenant;
	}	
	
	public Encadrer()
	{
		this.projet = null;
		this.intervenant = null;
	}
	
	public Project getProjet() {
		return this.projet;
	}


	public void setProjet(Project pProject) {
		this.projet = pProject;
	}
	
	public Intervenant getIntervenant() {
		return this.intervenant;
	}


	public void setIntervenant(Intervenant pIntervenant) {
		this.intervenant = pIntervenant;
	}
	
	@Override
	public String[] toTabString() {
		String[] tabS = { this.projet.toTabString().toString(), this.intervenant.toTabString().toString()};
		return tabS;
	}



}
