package dataStruct;

import bean.Pianta;

public class ListaPianta {
	private Pianta prima;

	public ListaPianta() {
		this.prima = null;
	}

	public Pianta getPrima() {
		return prima;
	}

	public boolean isEmpty() {
		return prima == null;
	}

	public void aggiungiPianta(Pianta pianta) {
		if (pianta == null)
			return;

		if (prima == null) {
			prima = pianta;
		} else {
			Pianta corrente = prima;
			while (corrente.getSuccessivo() != null) {
				corrente = corrente.getSuccessivo();
			}
			corrente.setSuccessivo(pianta);
		}
	}

	public int size() {
		int count = 0;
		Pianta corrente = prima;
		while (corrente != null) {
			count++;
			corrente = corrente.getSuccessivo();
		}
		return count;
	}

	public void visualizzaTutte() {
		if (isEmpty()) {
			System.out.println("Nessuna pianta nel catalogo.");
			return;
		}

		Pianta corrente = prima;
		int i = 1;
		while (corrente != null) {
			System.out.println(i + ". " + corrente);
			i++;
			corrente = corrente.getSuccessivo();
		}
	}
}
