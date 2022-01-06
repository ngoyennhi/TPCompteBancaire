package client;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Client {

	private String nom;
	private String prenom;
	private String adresseLigne1;
	private String adresseLigne2;
	private String adresseCP;
	private String adresseVille;
	private GregorianCalendar dateDateNaissance;
	 GregorianCalendar dateDefault = new GregorianCalendar();
	 
	//Declarer src pour input quand on saisi par le clavier
	Scanner src = new Scanner(System.in);
	
	// la contruction - les attributes de l'objet par défault
	public  Client() {
		// les valuers par default
		 nom = "toto";
		 prenom ="tata";
	     adresseLigne1 ="104 rue de la Galéra";
		 adresseLigne2 = "Appartement 32";
		 adresseCP = "34090";
		 adresseVille = "Montpellier";
	     dateDateNaissance = dateDefault;
	}
	
	// la contruction - les attributes de l'objet par paramettres
	public Client(String nom, String prenom, String adresseLigne1, String adresseLigne2, String adresseCP,String adresseVille, GregorianCalendar dateDeNaissance) {
		setNom(nom);
		setPrenom(prenom);
        setDateDateNaissance(dateDeNaissance);
		setAdresseLigne1(adresseLigne1);
		setAdresseLigne2(adresseLigne2);
		setAdresseCP(adresseCP);
        setAdresseVille(adresseVille);		
	}

	
	//la methode

	public void saisieDesInformationsClients() {
	    saisieNom();
	    saisiePrenom();
		saisieAdresseCP();
		saisieAdresseLigne1();
		saisieAdresseLigne2();
		saisieAdresseVille();
		saisieDateDeNaissance();
	}
	
public void affichageDesInformationsClients() {
	System.out.println("Le nom du compte: " + getNom());
	System.out.println("Numéro de compte: " + getPrenom());
	System.out.println("Adresse : " + getAdresseLigne1() + " - " + getAdresseLigne2() + " - " + getAdresseCP() + " - " + getAdresseVille());
	//le  mois de GregorianCalendar de 0 à 11 ==  jan à dec, donc , output il faut plus 1 pour afficher bon mois
	System.out.println("Date: " + (dateDateNaissance.get(Calendar.MONTH) + 1) + " " + dateDateNaissance.get(Calendar.DATE) + ", "+ dateDateNaissance.get(Calendar.YEAR)+ "\n");
}




public void saisieNom() {

		//nextLine() pour réinitialiser votre curseur
		System.out.println("veuillez saisir votre nom de compte");
		nom = src.nextLine();

		// Important pour une ligne blanche
		src.nextLine();
}

public void saisiePrenom() {
			//nextLine() pour réinitialiser votre curseur
		System.out.println("veuillez saisir votre prenom de compte");
		prenom = src.nextLine();

		// Important pour une ligne blanche
		src.nextLine();
}

public void saisieDateDeNaissance() {
		//nextLine() pour réinitialiser votre curseur
		System.out.println("veuillez saisir votre annee de naissance");
		int anneNaissance = src.nextInt();
		System.out.println("veuillez saisir votre mois de naissance");
		int moiNaissance = src.nextInt()-1;
		System.out.println("veuillez saisir votre jour de naissance");
		int jourNaissance = src.nextInt();
		
		//le  mois de GregorianCalendar de 0 à 11 ==  jan à dec, donc , input il faut moins 1 pour selectioner bon mois
		dateDateNaissance = new GregorianCalendar(anneNaissance, moiNaissance, jourNaissance);

		
		// Important pour une ligne blanche
		src.nextLine();
}

public void saisieAdresseCP() {

		//nextLine() pour réinitialiser votre curseur
		System.out.println("veuillez saisir votre code postale");
		adresseCP = src.nextLine();

		// Important pour une ligne blanche
		src.nextLine();
}

public void saisieAdresseLigne1() {
		//nextLine() pour réinitialiser votre curseur
		System.out.println("veuillez saisir votre premiere ligne de votre adresse");
		adresseLigne1 = src.nextLine();

		// Important pour une ligne blanche
		src.nextLine();
}

public void saisieAdresseLigne2() {

		//nextLine() pour réinitialiser votre curseur
		System.out.println("veuillez saisir votre deuxieme ligne de votre adresse");
		adresseLigne2 = src.nextLine();

		// Important pour une ligne blanche
		src.nextLine();
}

public void saisieAdresseVille() {

		//nextLine() pour réinitialiser votre curseur
		System.out.println("veuillez saisir votre ville");
		adresseVille = src.nextLine();

		// Important pour une ligne blanche
		src.nextLine();
}

public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getAdresseLigne1() {
	return adresseLigne1;
}
public void setAdresseLigne1(String adresseLigne1) {
	this.adresseLigne1 = adresseLigne1;
}
public String getAdresseLigne2() {
	return adresseLigne2;
}
public void setAdresseLigne2(String adresseLigne2) {
	this.adresseLigne2 = adresseLigne2;
}
public String getAdresseCP() {
	return adresseCP;
}
public void setAdresseCP(String adresseCP) {
	this.adresseCP = adresseCP;
}
public String getAdresseVille() {
	return adresseVille;
}
public void setAdresseVille(String adresseVille) {
	this.adresseVille = adresseVille;
}
public GregorianCalendar getDateDateNaissance() {
	return dateDateNaissance;
}
public void setDateDateNaissance(GregorianCalendar dateDateNaissance) {
	this.dateDateNaissance = dateDateNaissance;
}

}

//GregorianCalendar(int year, int month, int dayOfMonth)
