package it.unipv.sfw.esame.progettoC23.model;


public class IDMacchinario {
	private static String IDMacchinario;
	private String DataAcquisto;
	
	public IDMacchinario() {
	}
	
	public void setDataAcquisto(Macchinario M) {
	}
	
	public String getDataAcquisto(Macchinario M) {
		return DataAcquisto;
	}

	public void setIDMacchinario(Macchinario M) {
	
		IDMacchinario = M.getNomeMacchinario() +  M.dataAcquisto.replace("/", "");
	    }
	
	public static String getIDMacchinario() {
		return IDMacchinario;
	}

}
