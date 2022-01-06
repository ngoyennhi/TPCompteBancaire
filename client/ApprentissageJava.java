package client;

import client.Client;

public class ApprentissageJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Creer 4 objets classe CompteBancaire TP5 JAVA
		 */
		Client Client1 = new Client();	
		Client Client2 = new Client();	
		Client Client3 = new Client();	
	
		
		/*7 : Appel de méthode */
		Client1.saisieDesInformationsClients();
		Client1.affichageDesInformationsClients();
		
		Client2.saisieDesInformationsClients();	
		Client2.affichageDesInformationsClients();
		
		Client3.saisieDesInformationsClients();	
		Client3.affichageDesInformationsClients();

	}

}
