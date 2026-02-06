package business;

import bean.Pianta;
import dataStruct.ListaPianta;

public class GestioneCatalogo {
	private ListaPianta listaPianta;

	public GestioneCatalogo() {
		this.listaPianta = new ListaPianta();
	}
	
	public int getNumeroPiante() {
        return listaPianta.size();
    }
    
    public boolean isCatalogoVuoto() {
        return listaPianta.isEmpty();
    }

	public boolean aggiungiPianta(String specie, String famiglia, String grandezza, float prezzoVendita) {
        if (specie == null || specie.trim().isEmpty() ||
            famiglia == null || famiglia.trim().isEmpty() ||
            grandezza == null || grandezza.trim().isEmpty() ||
            prezzoVendita <= 0.0) {
            return false;
        }
        
        // invece di enum
        if (!grandezza.equalsIgnoreCase("S") && 
            !grandezza.equalsIgnoreCase("M") && 
            !grandezza.equalsIgnoreCase("L")) {
            System.out.println("Errore: Grandezza deve essere S, M o L");
            return false;
        }
        
        Pianta pianta = new Pianta(specie.trim(), famiglia.trim(), 
                                   grandezza.toUpperCase(), prezzoVendita);
        listaPianta.aggiungiPianta(pianta);
        return true;
    }

	public void modificaPianta() {

	}

	public void elminaPianta() {

	}

	public void visualizzaPiante() {
        System.out.println("\n=== CATALOGO PIANTE ===");
        listaPianta.visualizzaTutte();
        System.out.println("Totale: " + listaPianta.size() + " piante\n");
    }

	public void ricercaPianta() {

	}

}
