package compteBancaire;

import java.util.Scanner;

public class CompteBancaire {
private Integer numCpte;
private String nomCpte;
private Float solde;


// la construction de l'objet
// de réaliser une initialisation d'une ou plusieurs propriétés du futur objet 
public CompteBancaire() {
	numCpte = -1;
	nomCpte="un compte";
	solde = 0f;
}

//clique "Source" puis "Generate Getters Setter" puis selecter les variables que l'on veut

public Integer getNumCpte() {
	return numCpte;
}


public void setNumCpte(Integer numCpte) {
	this.numCpte = numCpte;
}


public String getNomCpte() {
	return nomCpte;
}


public void setNomCpte(String nomCpte) {
	this.nomCpte = nomCpte;
}


public Float getSolde() {
	return solde;
}


public void setSolde(Float solde) {
	this.solde = solde;
}

@Override
public String toString() {
	return "Compte numéro" + this.numCpte;
}

// la méthode
public void saisieDesInformationsBancaires() {
	@SuppressWarnings("resource")
	Scanner toto = new Scanner(System.in);

		//nextLine() pour réinitialiser votre curseur
		System.out.println("veuillez saisir votre nom de compte");
		nomCpte = toto.nextLine();

		// Important
		toto.nextLine();
		
	//changement de type
	System.out.println("Saissisez un nombre");
	numCpte = toto.nextInt();
	

	// Important
	toto.nextLine();
	
	//Retour au string
	System.out.println("Saisisez votre solde: ");
	 solde = toto.nextFloat();
	 
}

public void affichageDesInformationsBancaires() {
	System.out.println("Voici le nom du compte: " + nomCpte);
	System.out.println("Numéro de compte: " + numCpte);
	System.out.println("et Solde: " +solde);
}

}
