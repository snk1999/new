package snk;

public class EMBAUCHE extends Work {
private String entreprise ;
public EMBAUCHE (String entreprise) {
	this.entreprise=entreprise;
}
public EMBAUCHE() {}
public String getEntreprise() {
	return entreprise;
}

public void setEntreprise(String entreprise) {
	this.entreprise = entreprise;
}
public void printEntreprise() {
	printWork();
	System.out.println(this.entreprise);
	}
public void setJob(String entreprise,String name)	{
	this.entreprise=entreprise;
	super.setName(name);
	
	
}


}
