package fr.NounouScrignac.bo;

public class Enfant extends Parent{
	
	private int age;
	private String sexe;

	public Enfant(String nom, String prénom) {
		super(nom, prénom);
		// TODO Auto-generated constructor stub
	}

	public Enfant(String nom, String prénom, int age, String sexe) {
		super(nom, prénom);
		this.age = age;
		this.sexe = sexe;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	@Override
	public String toString() {
		return String.format("nom=%s prenom=%S age=%s mois sexe=%s]",nom, prenom, age, sexe);
	}
	
	
	

}
