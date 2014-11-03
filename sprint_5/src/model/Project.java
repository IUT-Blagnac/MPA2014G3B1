package model;


public class Project extends AbstractList {

	public String grProject;
	public String idSujet;

	public Project(String pGrProject, String pSujet)
	{
		this.grProject = pGrProject;
		this.idSujet = pSujet;
	}	
	
	public Project()
	{
		this("","") ;
	}	
	
	public String toString()
	{
		return grProject + "   " + idSujet;
		
	}
	
	public String[] toTabString()
	{
		String[] tabS = { this.grProject, this.idSujet};
		
		return tabS;
	}

	public String getGrProject() {
		return grProject;
	}

	public void setGrProject(String grProject) {
		this.grProject = grProject;
	}

	public String getSujet() {
		return idSujet;
	}

	public void setSujet(String sujet) {
		this.idSujet = sujet;
	}

}
