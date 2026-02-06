package bean;

public class Pianta {

	private String specie;
	private String famiglia;
	private String grandezza;
	private float prezzoVendita;
	private Pianta successivo = null;
	
	public Pianta(String specie, String famiglia, String grandezza, float prezzoVendita) {
		
		this.specie = specie;
        this.famiglia = famiglia;
        this.grandezza = grandezza;
        this.prezzoVendita = prezzoVendita;
        this.successivo = null;
	}
	
	public String getSpecie() {
		return specie;
	}

	public void setSpecie(String specie) {
		this.specie = specie;
	}

	public String getFamiglia() {
		return famiglia;
	}

	public void setFamiglia(String famiglia) {
		this.famiglia = famiglia;
	}

	public String getGrandezza() {
		return grandezza;
	}

	public void setGrandezza(String grandezza) {
		this.grandezza = grandezza;
	}

	public float getPrezzoVendita() {
		return prezzoVendita;
	}

	public void setPrezzoVendita(float prezzoVendita) {
		this.prezzoVendita = prezzoVendita;
	}
	
	public Pianta getSuccessivo() {
		return successivo;
	}

	public void setSuccessivo(Pianta successivo) {
		this.successivo = successivo;
	}

	@Override
    public String toString() {
        return "Pianta [specie = " + specie + 
               ", famiglia = " + famiglia + 
               ", grandezza = " + grandezza + 
               ", prezzo = " + prezzoVendita + "€]";
    }

	
	
}
