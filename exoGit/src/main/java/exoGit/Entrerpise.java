package exoGit;

import java.util.List;

public class Entrerpise {
	String nomEntreprise;
	List<Personnes> Employes;
	
	public Entrerpise(String nomEntreprise, List<Personnes> employes) {
		super();
		this.nomEntreprise = nomEntreprise;
		Employes = employes;
	}

	public String getNomEntreprise() {
		return nomEntreprise;
	}

	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}

	public List<Personnes> getEmployes() {
		return Employes;
	}

	public void setEmployes(List<Personnes> employes) {
		Employes = employes;
	}

	@Override
	public String toString() {
		return "Entrerpise [nomEntreprise=" + nomEntreprise + ", Employes=" + Employes + "]";
	}
	
			

}
