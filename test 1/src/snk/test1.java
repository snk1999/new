package snk;

public class test1 {

	

	public static void main(String[] args) {
		
	Work	a = new Work("engineer"); 
	
		a.printWork();
		
	EMBAUCHE B = new EMBAUCHE(" SHCNIDER");	
	B.setName("serveur");
	 B.printEntreprise();
	 
	 
	 Work[] job= new Work[2];
	 job[0] =new Work("pizza");
	 job[1] =new Work("pizza1");
	
for(int i=0;i<2;i++) {
	job[i].printWork();
}
 EMBAUCHE j=new EMBAUCHE();
 j.setJob("condor", "electricity");
 j.printEntreprise();
 
 
	}
 
}
