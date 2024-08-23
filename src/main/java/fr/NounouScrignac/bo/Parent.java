package fr.NounouScrignac.bo;

public class Parent extends Personne{

	private String telephone1;
	private String telephone2;
	private int noRue;
	private String rue;
	private String codePostal;
	private String ville;
	private String email;
	private String password;
	private Enfant enfant;
	
	public Parent(String nom, String prénom) {
		super(nom, prénom );
		// TODO Auto-generated constructor stub
	}

	public Parent(String nom, String prénom, String telephone1, String telephone2, int noRue, String rue, String codePostal, String ville) {
		super(nom, prénom);
		this.telephone1 = telephone1;
		this.telephone2 = telephone2;
		this.noRue = noRue;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	public String getTelephone1() {
		return telephone1;
	}

	public void setTelephone1(String telephone1) {
		this.telephone1 = telephone1;
	}

	public String getTelephone2() {
		return telephone2;
	}

	public void setTelephone2(String telephone2) {
		this.telephone2 = telephone2;
	}
	
	public int getNoRue() {
		return noRue;
	}

	public void setNoRue(int noRue) {
		this.noRue = noRue;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Enfant getEnfant() {
		return enfant;
	}

	public void setEnfant(Enfant enfant) {
		this.enfant = enfant;
	}

	@Override
	public String toString() {
		return String.format("nom=%s prenom=%s%n telephone1=%s%n telephone2=%s%n noRue=%s rue=%s%n codePostal=%s ville=%s%n email=%s%n]",
				nom, prenom, telephone1, telephone2, noRue, rue, codePostal, ville, email);
	}
	
	
	

}
