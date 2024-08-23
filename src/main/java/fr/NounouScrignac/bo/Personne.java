package fr.NounouScrignac.bo;

public abstract class Personne {
	
	protected String nom;
	protected String prenom;
	
	public Personne(String nom, String prénom) {
		this.nom = nom;
		this.prenom = prénom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrénom() {
		return prenom;
	}

	public void setPrénom(String prénom) {
		this.prenom = prénom;
	}

	@Override
	public String toString() {
		return String.format("nom=%s, prenom=%s%n", nom, prenom);
	}
	
	
	
	

}
