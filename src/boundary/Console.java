package boundary;

import java.util.Scanner;
import business.GestioneCatalogo;

public class Console {

	Scanner scanner = new Scanner(System.in);
	GestioneCatalogo gestione;

	public Console() {
		gestione = new GestioneCatalogo();
	}

	public void esegui() {

		stampaMenu();
	}

	private void stampaMenu() {
		int scelta;

		do {
			System.out.println("0 --> Uscita dal programma");
			System.out.println("1 --> Inserisci Pianta");
			System.out.println("2 --> Modifica Pianta");
			System.out.println("3 --> Elmina Pianta");
			System.out.println("4 --> Visualizza Piante");
			System.out.println("5 --> Ricerca Pianta");

			scelta = leggeScelta();

			switch (scelta) {

			case 0:
				System.out.println("Arrividerci");
				break;

			case 1:
				inserisciPianta();
				break;

			case 2:
				gestione.modificaPianta();
				break;

			case 3:
				gestione.elminaPianta();
				break;

			case 4:
				gestione.visualizzaPiante();
				break;

			case 5:
				gestione.ricercaPianta();
				break;

			default:
				System.err.println("Scelta non valida!");
				break;
			}

		} while (scelta != 0);

	}

	private int leggeScelta() {
		try {
			return Integer.parseInt(scanner.nextLine());
		} catch (Exception e) {
			return -1;
		}
	}

	private void inserisciPianta() {

		/*
		 * Specie: Esempio: "calendula", "rosa". Famiglia: Esempio: "rosacee",
		 * "succulente". Grandezza: Valori predefiniti (S, M, L). Prezzo di Vendita:
		 * Valore numerico (in Euro). Posizione: individuata da n scaffale a gradino
		 * (5), n gradino (5), n posizione nel gradino (10)
		 */

		System.out.println("\n=== INSERIMENTO NUOVA PIANTA ===");

		System.out.print("Specie: ");
		String specie = scanner.nextLine();

		System.out.print("Famiglia: ");
		String famiglia = scanner.nextLine();

		System.out.print("Grandezza (S/M/L): ");
		String grandezza = scanner.nextLine();

		System.out.print("Prezzo di vendita: ");
		float prezzoVendita = Float.parseFloat(scanner.nextLine());

		if (gestione.aggiungiPianta(specie, famiglia, grandezza, prezzoVendita)) {
			System.out.println("Pianta '" + specie + "' aggiunta con successo!");
		} else {
			System.out.println("Errore: pianta non valida. Controllare i dati inseriti.");
		}
	}
}
