package compteBancaire;

import compteBancaire.CompteBancaire;

public class ApprentissageJava {

		/**
		 * @param args the command line arguments TP5 JAVA
		 */
		public static void main(String[] args) {
//			//TODO code application logic here
//			//Calculette objCalculatte = new Calculette();
//			//objCalculette.setTitle("Menu ;");
//			//objCalculette.setVisible(true);
//			
//			//Créer une instance de la classe CompteBancaire reliée à la varibale objPittDAV.
//			CompteBancaire objPittDAV;
//			// objPittDAV contient la l’adresse mémoire de l’objet crée
//			objPittDAV=new CompteBancaire();	
//		
//			
//			CompteBancaire objPittCSL;
//			objPittCSL = new CompteBancaire();
//			
//			CompteBancaire objPittLivA;
//			objPittLivA = new CompteBancaire();
//			
//			System.out.println(objPittDAV);
//			System.out.println(objPittCSL);
//			System.out.println(objPittLivA);
//			
//			//la demande de saisie ne se manifeste seulement que par le clignotement du curseur
//			try (Scanner in = new Scanner(System.in)) {
//				//nextLine() pour réinitialiser votre curseur
//				String chaineLue = in.nextLine();
//				System.out.println("Voici la chaine saisie: " + chaineLue);
//			//changement de type
//			System.out.println("Saissisez un nombre");
//			int nombreLu = in.nextInt();
//			System.out.println("Nombre: " + nombreLu);
//		
//			// Important
//			in.nextLine();
//			
//			//Retour au string
//			System.out.println("Saisisez une nouvelle chaine: ");
//			String reChaineLue = in.nextLine();
//			System.out.println("Voici la chaine saisie: " + reChaineLue);
//			in.close();
//			}
//			
		 
			//4 Application 1: placez tout le code de cette méthode en commentaire ( les codes précedents)
			
			/*
			 * Creer 4 objets classe CompteBancaire
			 */
			CompteBancaire Client1 = new CompteBancaire();	
			CompteBancaire Client2 = new CompteBancaire();	
			CompteBancaire Client3 = new CompteBancaire();	
			CompteBancaire Client4 = new CompteBancaire();
			
			/*7 : Appel de méthode */
			Client1.saisieDesInformationsBancaires();
			Client1.affichageDesInformationsBancaires();
			
			Client2.saisieDesInformationsBancaires();	
			Client2.affichageDesInformationsBancaires();
			
			Client3.saisieDesInformationsBancaires();	
			Client3.affichageDesInformationsBancaires();
			
			Client4.saisieDesInformationsBancaires();
			Client4.affichageDesInformationsBancaires();
			
		}
	}
